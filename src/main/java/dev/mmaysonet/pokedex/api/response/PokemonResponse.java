package dev.mmaysonet.pokedex.api.response;

public record PokemonResponse(
    String id,
    String name
) {

    public PokemonResponse {
        if (id == null) id = "Unknown";
        if (name == null) name = "Unknown";
    }
}
