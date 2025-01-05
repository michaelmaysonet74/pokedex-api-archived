package dev.mmaysonet.pokedex.model;

import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record Pokemon(
    @NonNull String id,
    @NonNull String name
) {
}
