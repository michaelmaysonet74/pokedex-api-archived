package dev.mmaysonet.pokedex.repository;

import dev.mmaysonet.pokedex.model.Pokemon;
import lombok.NonNull;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.Optional;

@Repository
public class PokemonRepository {

    private final Map<String, String> pokedex = Map.of(
        "1", "Bulbasaur",
        "2", "Ivysaur",
        "3", "Venusaur",
        "4", "Charmander",
        "5", "Charmeleon",
        "6", "Charizard",
        "7", "Squirtle",
        "8", "Wartortle",
        "9", "Blastoise",
        "149", "Dragonite"
    );

    public Mono<Optional<Pokemon>> getPokemonById(@NonNull String id) {
        return Optional.ofNullable(pokedex.get(id))
            .map(name -> Mono.just(Optional.of(new Pokemon(id, name))))
            .orElse(Mono.just(Optional.empty()));
    }
}
