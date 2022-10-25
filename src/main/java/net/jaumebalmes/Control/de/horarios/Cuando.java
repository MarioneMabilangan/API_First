package net.jaumebalmes.Control.de.horarios;

import java.text.SimpleDateFormat;

public class Cuando {
    private Alumne alumne;
    private String entrada = String.valueOf(new SimpleDateFormat("HH:mm:ss"));
    private String salida = String.valueOf(new SimpleDateFormat("HH:mm:ss"));

    public Alumne getAlumne() {
        return alumne;
    }

    public void setAlumne(Alumne alumne) {
        this.alumne = alumne;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public Cuando(Alumne alumne, String entrada, String salida) {
        this.alumne = alumne;
        this.entrada = entrada;
        this.salida = salida;
    }
}
