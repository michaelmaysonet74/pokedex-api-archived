package dev.mmaysonet.pokedex.mapper;

import dev.mmaysonet.pokedex.api.response.PokemonResponse;
import dev.mmaysonet.pokedex.api.response.PokemonTypesResponse;
import dev.mmaysonet.pokedex.entity.PokemonEntity;
import dev.mmaysonet.pokedex.model.Pokemon;
import dev.mmaysonet.pokedex.model.PokemonType;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PokemonMapper {

  Pokemon toPokemon(PokemonEntity pokemonEntity);

  @Mapping(source = "types", target = "types", qualifiedByName = "mapTypes")
  PokemonResponse toPokemonResponse(Pokemon pokemon);

  @Named("mapTypes")
  default PokemonTypesResponse mapTypes(List<PokemonType> types) {
    return PokemonTypesResponse.builder()
        .primary(types.get(0).name())
        .secondary(types.size() > 1 ? types.get(1).name() : null)
        .build();
  }
}
