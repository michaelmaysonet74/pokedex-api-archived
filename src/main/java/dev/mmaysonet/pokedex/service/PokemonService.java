package dev.mmaysonet.pokedex.service;

import dev.mmaysonet.pokedex.model.Pokemon;
import dev.mmaysonet.pokedex.repository.PokemonRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public Mono<Optional<Pokemon>> getPokemonById(@NonNull String id) {
        return pokemonRepository.getPokemonById(id);
    }
}
