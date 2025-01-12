package dev.mmaysonet.pokedex.api.response;

import dev.mmaysonet.pokedex.entity.BaseStatsEntity;
import dev.mmaysonet.pokedex.entity.MeasurementEntity;
import dev.mmaysonet.pokedex.model.Ability;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record PokemonResponse(
    @NonNull Integer id,
    @NonNull String name,
    List<Ability> abilities,
    BaseStatsEntity baseStats,
    String category,
    String entry,
    EvolutionChainResponse evolution,
    Integer generation,
    MeasurementEntity measurement,
    String sprite,
    List<String> types,
    List<String> weaknesses) {}
