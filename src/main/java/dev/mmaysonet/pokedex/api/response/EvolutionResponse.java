package dev.mmaysonet.pokedex.api.response;

import lombok.Builder;

@Builder(toBuilder = true)
public record EvolutionResponse(String id, String name) {}
