package es.fplumara.dam1.superheroes.service;

import es.fplumara.dam1.superheroes.model.Superheroes;

import java.util.List;
import java.util.Optional;

public interface SuperheroeInterface {
    Optional<Superheroes> FindHero(String name);

    List<Superheroes> FindHeroes();

    Superheroes insertHero(Superheroes Superheroe);

    Superheroes updateHero(Superheroes Superheroe);
}
