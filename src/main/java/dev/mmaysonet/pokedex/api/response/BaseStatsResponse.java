package dev.mmaysonet.pokedex.api.response;

import lombok.Builder;

@Builder(toBuilder = true)
public record BaseStatsResponse(
    int hp, int attack, int defense, int specialAttack, int specialDefense, int speed) {}
