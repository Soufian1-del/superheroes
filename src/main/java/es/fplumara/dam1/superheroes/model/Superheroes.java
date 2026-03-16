package es.fplumara.dam1.superheroes.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Superheroes {
    private String nombre;
    private String apodo;
    private Franquicia franquicia;
    private String poder;

    public void validations(){
        if(this.getNombre()==null || this.getNombre().isBlank()){
            throw new RuntimeException("Please, insert a valid hero name");
        }
        if(this.getApodo()==null || this.getApodo().isBlank()){
            throw new RuntimeException("Please, insert a valid hero Alias");
        }
        if(this.getFranquicia()==null){
            throw new RuntimeException("Please, insert a valid hero franchise");
        }
        if(this.getPoder()==null || this.getPoder().isBlank()){
            throw new RuntimeException("Please, insert a valid hero power");
        }
    }
}
