package es.fplumara.dam1.superheroes.controller;


import es.fplumara.dam1.superheroes.model.Superheroes;
import es.fplumara.dam1.superheroes.service.SuperheroeInterfaceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SuperheroController {
    @Autowired
    private  SuperheroeInterfaceIMPL superInteface;

    @PostMapping("/Superheroes/guardar")
    public String saveHero(@ModelAttribute Superheroes superheroe, Model model) {
        model.addAttribute("Hero saved", superheroe);
        return "Hero saved";
    }

    @GetMapping("/Superheroes/{nombre}")
    public String listadoHeroes(Model model, @PathVariable("nombre") String nombre) {
        model.addAttribute("title","hero list, name: "+ nombre);
        return  "listadoHeroes";
    }
}
