package dev.mmaysonet.pokedex.entity;

import dev.mmaysonet.pokedex.model.Ability;
import java.util.List;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pokemon")
public record PokemonEntity(
    @Id String _id,
    @NonNull Integer id,
    @NonNull String name,
    List<Ability> abilities,
    BaseStatsEntity baseStats,
    String category,
    Integer generation,
    MeasurementEntity measurement,
    String sprite,
    List<String> types,
    List<String> weaknesses) {}
