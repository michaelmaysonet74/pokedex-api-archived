package dev.mmaysonet.pokedex.model;

import java.util.List;

public record EvolutionChain(Evolution from, List<Evolution> to) {}
