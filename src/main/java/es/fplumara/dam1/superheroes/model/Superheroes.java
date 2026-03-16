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
}
