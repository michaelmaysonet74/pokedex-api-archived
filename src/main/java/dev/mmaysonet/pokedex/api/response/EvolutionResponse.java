package dev.mmaysonet.pokedex.api.response;

import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record EvolutionResponse(@NonNull String id, @NonNull String name) {}
