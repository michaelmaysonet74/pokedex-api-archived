package dev.mmaysonet.pokedex.entity;

import java.util.List;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemon")
public record PokemonEntity(
    @Id String _id,
    int id,
    @NonNull String name,
    @NonNull List<AbilityEntity> abilities,
    @NonNull BaseStatsEntity baseStats,
    @NonNull String category,
    @NonNull String entry,
    @NonNull EvolutionChainEntity evolution,
    int generation,
    @NonNull MeasurementEntity measurement,
    @NonNull String sprite,
    @NonNull List<String> types,
    @NonNull List<String> weaknesses) {}
