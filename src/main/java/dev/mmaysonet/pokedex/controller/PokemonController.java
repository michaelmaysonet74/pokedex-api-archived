package dev.mmaysonet.pokedex.controller;

import dev.mmaysonet.pokedex.api.response.PokemonResponse;
import dev.mmaysonet.pokedex.mapper.PokemonMapper;
import dev.mmaysonet.pokedex.service.PokemonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/pokemon")
@RequiredArgsConstructor
public class PokemonController {

    private final PokemonService pokemonService;
    private final PokemonMapper pokemonMapper;

    @GetMapping("/{id}")
    public Mono<ResponseEntity<PokemonResponse>> getPokemonById(@PathVariable Integer id) {
        return pokemonService.getPokemonById(id).map(maybePokemon ->
            maybePokemon
                .map(pokemonMapper::toPokemonResponse)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build())
        );
    }

    @GetMapping()
    public Mono<ResponseEntity<PokemonResponse>> getPokemonByName(@RequestParam String name) {
        // TODO: Implement this method
        return Mono.just(
            ResponseEntity.ok(new PokemonResponse(null, name))
        );
    }
}
