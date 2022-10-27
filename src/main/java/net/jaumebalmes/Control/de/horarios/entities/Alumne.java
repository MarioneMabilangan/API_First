package net.jaumebalmes.Control.de.horarios.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Alumne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nom;
	private String cognoms;
	private String email;
	
	@ManyToOne
	@JoinColumn(name="grupo_id")
	private Grupo grupo;
	
	public Alumne() {
	}	
	
	public Alumne(long id, String nom, String cognoms, String email, Grupo grupo) {
		super();
		this.id = id;
		this.nom = nom;
		this.cognoms = cognoms;
		this.email = email;
		this.grupo = grupo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
}
