package dev.mmaysonet.pokedex.model;

import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record Ability(@NonNull String name, String effect, boolean isHidden) {}
