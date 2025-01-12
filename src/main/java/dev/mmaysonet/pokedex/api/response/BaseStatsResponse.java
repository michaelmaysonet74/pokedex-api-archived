package dev.mmaysonet.pokedex.api.response;

import lombok.Builder;

@Builder(toBuilder = true)
public record BaseStatsResponse(
    Integer hp,
    Integer attack,
    Integer defense,
    Integer specialAttack,
    Integer specialDefense,
    Integer speed) {}
