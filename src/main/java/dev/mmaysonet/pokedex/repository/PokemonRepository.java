package dev.mmaysonet.pokedex.repository;

import dev.mmaysonet.pokedex.entity.PokemonEntity;
import lombok.NonNull;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface PokemonRepository extends ReactiveMongoRepository<PokemonEntity, String> {

  Mono<PokemonEntity> findPokemonById(@NonNull Integer id);

  Mono<PokemonEntity> findPokemonByName(@NonNull String name);
}
