package dev.mmaysonet.pokedex.entity;

import lombok.NonNull;
import org.springframework.data.annotation.Id;

public record EvolutionEntity(@Id String _id, @NonNull String id, @NonNull String name) {}
