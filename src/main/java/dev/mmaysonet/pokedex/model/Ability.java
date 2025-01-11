package dev.mmaysonet.pokedex.model;

import lombok.Builder;

@Builder(toBuilder = true)
public record Ability(String name, String effect, boolean isHidden) {}
