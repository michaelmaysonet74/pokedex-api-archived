package dev.mmaysonet.pokedex.api.response;

import java.util.List;
import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record PokemonResponse(
    @NonNull String id,
    @NonNull String name,
    @NonNull List<AbilityResponse> abilities,
    @NonNull BaseStatsResponse baseStats,
    @NonNull String category,
    @NonNull String entry,
    @NonNull EvolutionChainResponse evolution,
    int generation,
    @NonNull MeasurementResponse measurement,
    @NonNull String sprite,
    @NonNull PokemonTypesResponse types,
    @NonNull List<String> immunities,
    @NonNull List<String> resistances,
    @NonNull List<String> weaknesses) {}
