package dev.mmaysonet.pokedex.api.response;

import java.util.List;
import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record PokemonResponse(
    @NonNull Integer id,
    @NonNull String name,
    List<AbilityResponse> abilities,
    BaseStatsResponse baseStats,
    String category,
    String entry,
    EvolutionChainResponse evolution,
    Integer generation,
    MeasurementResponse measurement,
    String sprite,
    List<String> types,
    List<String> weaknesses) {}
