package dev.mmaysonet.pokedex.api.response;

import java.util.List;

public record PokemonResponse(
    String id,
    String name,
    List<String> types
) {

    public PokemonResponse {
        if (id == null) id = "Unknown";
        if (name == null) name = "Unknown";
        if (types == null) types = List.of();
    }
}
