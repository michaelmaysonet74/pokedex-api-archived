package dev.mmaysonet.pokedex.model;

import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record Evolution(@NonNull String id, @NonNull String name) {}
