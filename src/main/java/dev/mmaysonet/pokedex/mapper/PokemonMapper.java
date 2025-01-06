package dev.mmaysonet.pokedex.mapper;

import dev.mmaysonet.pokedex.api.response.PokemonResponse;
import dev.mmaysonet.pokedex.entity.PokemonEntity;
import dev.mmaysonet.pokedex.model.Pokemon;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PokemonMapper {

    Pokemon toPokemon(PokemonEntity pokemonEntity);

    PokemonResponse toPokemonResponse(Pokemon pokemon);
}
