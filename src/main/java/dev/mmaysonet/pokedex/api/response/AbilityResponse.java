package dev.mmaysonet.pokedex.api.response;

import lombok.Builder;
import lombok.NonNull;

@Builder(toBuilder = true)
public record AbilityResponse(@NonNull String name, @NonNull String effect, boolean isHidden) {}
