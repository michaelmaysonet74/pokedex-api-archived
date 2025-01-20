package dev.mmaysonet.pokedex.model;

import dev.mmaysonet.pokedex.entity.BaseStatsEntity;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record Pokemon(
    int id,
    @NonNull String name,
    @NonNull List<Ability> abilities,
    @NonNull BaseStatsEntity baseStats,
    @NonNull String category,
    @NonNull String entry,
    @NonNull EvolutionChain evolution,
    int generation,
    @NonNull Measurement measurement,
    @NonNull String sprite,
    @NonNull List<PokemonType> types,
    @NonNull List<PokemonType> weaknesses) {}
