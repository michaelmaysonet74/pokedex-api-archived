package dev.mmaysonet.pokedex.entity;

public record BaseStatsEntity(
    Integer hp,
    Integer attack,
    Integer defense,
    Integer specialAttack,
    Integer specialDefense,
    Integer speed) {}
