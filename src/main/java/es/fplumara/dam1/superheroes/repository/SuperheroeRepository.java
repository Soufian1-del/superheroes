package es.fplumara.dam1.superheroes.repository;

import es.fplumara.dam1.superheroes.model.Superheroes;

import java.util.List;
import java.util.Optional;

public interface SuperheroeRepository {
    void initSchema();

    Optional<Superheroes> findByName(String name);

    List<Superheroes> findAll();

    Superheroes insert(Superheroes Superheroe);

    Superheroes update(Superheroes Superheroe);
}
