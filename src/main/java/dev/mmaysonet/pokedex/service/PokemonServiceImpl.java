package dev.mmaysonet.pokedex.service;

import dev.mmaysonet.pokedex.mapper.PokemonMapper;
import dev.mmaysonet.pokedex.model.Pokemon;
import dev.mmaysonet.pokedex.repository.PokemonRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService {

    private final PokemonRepository pokemonRepository;
    private final PokemonMapper pokemonMapper;

    @Override
    public Mono<Optional<Pokemon>> getPokemonById(@NonNull Integer id) {
        return pokemonRepository.findPokemonById(id)
            .map(maybePokemon ->
                Optional.ofNullable(maybePokemon).map(pokemonMapper::toPokemon)
            )
            .switchIfEmpty(Mono.just(Optional.empty()));
    }
}
