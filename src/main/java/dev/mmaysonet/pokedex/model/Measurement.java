package dev.mmaysonet.pokedex.model;

import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record Measurement(@NonNull String height, @NonNull String weight) {}
