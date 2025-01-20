package dev.mmaysonet.pokedex.model;

import java.util.List;
import lombok.Builder;

@Builder(toBuilder = true)
public record EvolutionChain(Evolution from, List<Evolution> to) {}
