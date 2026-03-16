package es.fplumara.dam1.superheroes.repository;

import es.fplumara.dam1.superheroes.model.Superheroes;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class SuperheroeRepositoryInMemory implements SuperheroeRepository{
    Map<String, Superheroes> data;

    @Override
    public void initSchema() {
        data = new HashMap<>();
    }

    @Override
    public Optional<Superheroes> findByName(String name) {
        if(name==null){
            throw new RuntimeException("Please, insert a valid superhero name");
        }
        return Optional.ofNullable(data.get(name));
    }

    @Override
    public List<Superheroes> findAll() {
        return new ArrayList<>(data.values());
    }

    @Override
    public Superheroes insert(Superheroes Superheroe) {
        if(Superheroe==null){
            throw new RuntimeException("please insert a valid Superhero");
        }
        data.put(Superheroe.getNombre(), Superheroe);
        return Superheroe;
    }

    @Override
    public Superheroes update(Superheroes Superheroe) {
        if(Superheroe==null){
            throw new RuntimeException("please insert a valid Superhero");
        }
        data.put(Superheroe.getNombre(), Superheroe);
        return Superheroe;
    }
}
