package dev.mmaysonet.pokedex.service;

import dev.mmaysonet.pokedex.mapper.PokemonMapper;
import dev.mmaysonet.pokedex.model.Pokemon;
import dev.mmaysonet.pokedex.repository.PokemonRepository;
import java.util.Optional;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

  private final PokemonRepository pokemonRepository;
  private final PokemonMapper pokemonMapper;

  @Override
  public Mono<Optional<Pokemon>> getPokemonById(int id) {
    return pokemonRepository
        .findPokemonById(id)
        .map(entity -> Optional.ofNullable(entity).map(pokemonMapper::toPokemon))
        .switchIfEmpty(Mono.just(Optional.empty()));
  }

  @Override
  public Mono<Optional<Pokemon>> getPokemonByName(@NonNull String name) {
    return pokemonRepository
        .findPokemonByName(name)
        .map(entity -> Optional.ofNullable(entity).map(pokemonMapper::toPokemon))
        .switchIfEmpty(Mono.just(Optional.empty()));
  }
}
