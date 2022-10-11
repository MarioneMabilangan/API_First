package net.jaumebalmes.Control.de.horarios;

import java.time.LocalDate;

public class Alumne {
    private String nom;
    private String cognoms;
    private LocalDate dataNaixement;
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
    public LocalDate getDataNaixement() {
        return dataNaixement;
    }
    public void setDataNaixement(LocalDate dataNaixement) {
        this.dataNaixement = dataNaixement;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public Alumne(String nom, String cognoms, LocalDate dataNaixement, String grup) {
        super();
        this.nom = nom;
        this.cognoms = cognoms;
        this.dataNaixement = dataNaixement;
        this.grup = grup;
    }
}

