package dev.mmaysonet.pokedex.entity;

import java.util.List;

public record EvolutionChainEntity(EvolutionEntity from, List<EvolutionEntity> to) {}
