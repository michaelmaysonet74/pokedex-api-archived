package dev.mmaysonet.pokedex.entity;

import org.springframework.data.annotation.Id;

public record EvolutionEntity(@Id String _id, String id, String name) {}
