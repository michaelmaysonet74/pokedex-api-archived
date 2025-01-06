package dev.mmaysonet.pokedex.entity;

import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "pokemon")
public record PokemonEntity(
    @Id String _id,
    @NonNull Integer id,
    @NonNull String name,
    List<String> types
) {
}
