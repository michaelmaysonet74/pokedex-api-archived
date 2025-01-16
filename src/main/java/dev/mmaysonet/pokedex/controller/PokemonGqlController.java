package dev.mmaysonet.pokedex.controller;

import dev.mmaysonet.pokedex.api.response.PokemonResponse;
import dev.mmaysonet.pokedex.mapper.PokemonMapper;
import dev.mmaysonet.pokedex.service.PokemonService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class PokemonGqlController {

  private final PokemonService pokemonService;
  private final PokemonMapper pokemonMapper;

  @QueryMapping
  public Mono<Optional<PokemonResponse>> pokemonById(@Argument int id) {
    return pokemonService
        .getPokemonById(id)
        .map(maybePokemon -> maybePokemon.map(pokemonMapper::toPokemonResponse));
  }

  @QueryMapping
  public Mono<Optional<PokemonResponse>> pokemonByName(@Argument String name) {
    return pokemonService
        .getPokemonByName(name)
        .map(maybePokemon -> maybePokemon.map(pokemonMapper::toPokemonResponse));
  }
}
