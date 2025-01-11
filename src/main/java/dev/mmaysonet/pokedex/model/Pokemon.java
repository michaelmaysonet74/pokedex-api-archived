package dev.mmaysonet.pokedex.model;

import dev.mmaysonet.pokedex.entity.BaseStatsEntity;
import dev.mmaysonet.pokedex.entity.MeasurementEntity;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record Pokemon(
    @NonNull Integer id,
    @NonNull String name,
    List<Ability> abilities,
    BaseStatsEntity baseStats,
    String category,
    Integer generation,
    MeasurementEntity measurement,
    String sprite,
    List<PokemonType> types,
    List<PokemonType> weaknesses) {}
