package dev.mmaysonet.pokedex.api.response;

import lombok.Builder;

@Builder(toBuilder = true)
public record MeasurementResponse(String height, String weight) {}
