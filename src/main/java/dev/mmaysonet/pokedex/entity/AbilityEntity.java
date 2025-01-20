package dev.mmaysonet.pokedex.entity;

import lombok.NonNull;

public record AbilityEntity(@NonNull String name, String effect, boolean isHidden) {}
