package dev.mmaysonet.pokedex.service;

import dev.mmaysonet.pokedex.model.Pokemon;
import lombok.NonNull;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface PokemonService {

    Mono<Optional<Pokemon>> getPokemonById(@NonNull Integer id);
}
