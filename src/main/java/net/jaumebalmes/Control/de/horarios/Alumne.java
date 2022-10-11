package net.jaumebalmes.Control.de.horarios;

import java.time.LocalDate;

public class Alumne {
    private String nom;
    private String cognoms;
    private String email;
    private String grup;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCognoms() {
        return cognoms;
    }
    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public Alumne(String nom, String cognoms, String email, String grup) {
        super();
        this.nom = nom;
        this.cognoms = cognoms;
        this.email = email;
        this.grup = grup;
    }
}

