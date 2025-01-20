package dev.mmaysonet.pokedex.model;

import lombok.Builder;

@Builder(toBuilder = true)
public record BaseStats(
    int hp, int attack, int defense, int specialAttack, int specialDefense, int speed) {}
