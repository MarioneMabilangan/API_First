package net.jaumebalmes.Control.de.horarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {
    @GetMapping("/alumnes")
    public List<Alumne> getAlumnes(){
        ArrayList<Alumne> Alumnes = new ArrayList<>();

        Alumnes.add(new Alumne("Marione","Basaysay Mabilangan", LocalDate.of(2003, Month.JUNE, 4), "DAM2"));
        Alumnes.add(new Alumne("Jesus","Cristo", LocalDate.of(2003, Month.JUNE, 4), "ASIX"));
        Alumnes.add(new Alumne("Jose","Ricardo", LocalDate.of(2003, Month.JUNE, 4), "DAM2"));
        return Alumnes;
    }

    @GetMapping("/alumnes/{id}")
    public Alumne getnAlumnes(@PathVariable int id){
        ArrayList<Alumne> alumnes = new ArrayList<>();

        alumnes.add(new Alumne("Marione","Basaysay Mabilangan", LocalDate.of(2003, Month.JUNE, 4), "DAM2"));
        alumnes.add(new Alumne("Jesus","Cristo", LocalDate.of(2003, Month.JUNE, 4), "ASIX"));
        alumnes.add(new Alumne("Jose","Ricardo", LocalDate.of(2003, Month.JUNE, 4), "DAM2"));
        return alumnes.get(id);
    }
}
