package dev.mmaysonet.pokedex.service;

import dev.mmaysonet.pokedex.model.Pokemon;
import java.util.Optional;
import lombok.NonNull;
import reactor.core.publisher.Mono;

public interface PokemonService {

  Mono<Optional<Pokemon>> getPokemonById(int id);

  Mono<Optional<Pokemon>> getPokemonByName(@NonNull String name);
}
