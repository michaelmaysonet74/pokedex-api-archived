package dev.mmaysonet.pokedex.model;

import lombok.Builder;
import lombok.NonNull;

import java.util.List;

@Builder(toBuilder = true)
public record Pokemon(
    @NonNull String id,
    @NonNull String name,
    List<String> types
) {
}
