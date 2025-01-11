package dev.mmaysonet.pokedex.entity;

import java.util.List;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemon")
public record PokemonEntity(
    @Id String _id,
    @NonNull Integer id,
    @NonNull String name,
    List<AbilityEntity> abilities,
    BaseStatsEntity baseStats,
    String category,
    String entry,
    EvolutionChainEntity evolution,
    Integer generation,
    MeasurementEntity measurement,
    String sprite,
    List<String> types,
    List<String> weaknesses) {}
