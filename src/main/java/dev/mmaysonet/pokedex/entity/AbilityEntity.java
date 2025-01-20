package dev.mmaysonet.pokedex.entity;

import lombok.NonNull;

public record AbilityEntity(@NonNull String name, @NonNull String effect, boolean isHidden) {}
