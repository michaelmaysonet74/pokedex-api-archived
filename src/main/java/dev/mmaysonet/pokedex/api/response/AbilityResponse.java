package dev.mmaysonet.pokedex.api.response;

import lombok.Builder;

@Builder(toBuilder = true)
public record AbilityResponse(String name, String effect, boolean isHidden) {}
