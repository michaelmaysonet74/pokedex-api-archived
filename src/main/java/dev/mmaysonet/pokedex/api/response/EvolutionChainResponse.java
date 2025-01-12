package dev.mmaysonet.pokedex.api.response;

import java.util.List;
import lombok.Builder;

@Builder(toBuilder = true)
public record EvolutionChainResponse(EvolutionResponse from, List<EvolutionResponse> to) {}
