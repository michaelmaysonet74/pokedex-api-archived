package dev.mmaysonet.pokedex.controller;

import dev.mmaysonet.pokedex.model.Pokemon;
import dev.mmaysonet.pokedex.service.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/pokemon")
@RequiredArgsConstructor
public class PokemonController {

    private final PokemonService pokemonService;

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Pokemon>> getPokemonById(@PathVariable String id) {
        return pokemonService.getPokemonById(id).map(pokemon ->
            pokemon.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build())
        );
    }
}
