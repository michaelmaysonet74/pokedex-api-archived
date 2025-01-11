package dev.mmaysonet.pokedex.model;

import lombok.Builder;

@Builder(toBuilder = true)
public record Measurement(String height, String weight) {}
