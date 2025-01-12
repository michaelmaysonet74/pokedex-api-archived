package dev.mmaysonet.pokedex.model;

import lombok.Builder;

@Builder(toBuilder = true)
public record BaseStats(
    Integer hp,
    Integer attack,
    Integer defense,
    Integer specialAttack,
    Integer specialDefense,
    Integer speed) {}
