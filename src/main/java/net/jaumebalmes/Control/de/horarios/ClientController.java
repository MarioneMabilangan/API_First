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

        Alumnes.add(new Alumne("Marione","Basaysay Mabilangan", "mbasaysa@jaumebalmes.net", "DAM2"));
        Alumnes.add(new Alumne("Jesus","Cristo", "jcristo@jaumebalmes.net", "ASIX"));
        Alumnes.add(new Alumne("Jose","Ricardo", "jfrancis@jaumebalmes.net", "DAM2"));
        return Alumnes;
    }

    @GetMapping("/alumnes/{id}")
    public Alumne getnAlumnes(@PathVariable int id){
        ArrayList<Alumne> alumnes = new ArrayList<>();

        alumnes.add(new Alumne("Marione","Basaysay Mabilangan", "mbasaysa@jaumebalmes.net", "DAM2"));
        alumnes.add(new Alumne("Jesus","Cristo", "jcristo@jaumebalmes.net", "ASIX"));
        alumnes.add(new Alumne("Jose","Ricardo", "jfrancis@jaumebalmes.net", "DAM2"));
        return alumnes.get(id);
    }

    @GetMapping("/cuando")
    public List<Cuando> getCuando(){
        ArrayList<Alumne> Alumnes = new ArrayList<>();
        ArrayList<Cuando> Hora = new ArrayList<>();

        Alumnes.add(new Alumne("Marione","Basaysay Mabilangan", "mbasaysa@jaumebalmes.net", "DAM2"));
        Alumnes.add(new Alumne("Jesus","Cristo", "jcristo@jaumebalmes.net", "ASIX"));
        Alumnes.add(new Alumne("Jose","Ricardo", "jfrancis@jaumebalmes.net", "DAM2"));

        for(Alumne al : Alumnes)
        Hora.add(new Cuando(al, "15:30:01", "21:00:01"));
        return Hora;
    }
    
    @GetMapping("/horas")
    public List<Horas> getHoras(){
        ArrayList<Alumne> Alumnes = new ArrayList<>();
        ArrayList<Horas> Hora = new ArrayList<>();

        Alumnes.add(new Alumne("Marione","Basaysay Mabilangan", "mbasaysa@jaumebalmes.net", "DAM2"));
        Alumnes.add(new Alumne("Jesus","Cristo", "jcristo@jaumebalmes.net", "ASIX"));
        Alumnes.add(new Alumne("Jose","Ricardo", "jfrancis@jaumebalmes.net", "DAM2"));

        for(Alumne al : Alumnes)
        Hora.add(new Horas(al, 3, 42.45, 127.00));
        return Hora;
    }
}
