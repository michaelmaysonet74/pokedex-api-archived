package dev.mmaysonet.pokedex.api.response;

import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record PokemonTypesResponse(@NonNull String primary, String secondary) {}
