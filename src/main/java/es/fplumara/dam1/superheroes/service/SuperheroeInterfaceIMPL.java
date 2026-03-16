package es.fplumara.dam1.superheroes.service;

import es.fplumara.dam1.superheroes.model.Superheroes;
import es.fplumara.dam1.superheroes.repository.SuperheroeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class SuperheroeInterfaceIMPL implements SuperheroeInterface {

    @Autowired
    private final SuperheroeRepository superRepo;

    @Override
    public Optional<Superheroes> FindHero(String name) {
        if(name==null || name.isEmpty()){
            throw new RuntimeException("Please, insert a valid superhero name");
        }

        return superRepo.findByName(name);
    }

    @Override
    public List<Superheroes> FindHeroes() {
        return superRepo.findAll();
    }

    @Override
    public Superheroes insertHero(Superheroes Superheroe) {
        if(Superheroe==null){
            throw new RuntimeException("The hero must not be null");
        }
        Superheroe.validations();
        return superRepo.insert(Superheroe);
    }

    @Override
    public Superheroes updateHero(Superheroes Superheroe) {
        Superheroe.validations();
        if(Superheroe==null){
            throw new RuntimeException("The hero must not be null");
        }
        return superRepo.update(Superheroe);
    }
}
