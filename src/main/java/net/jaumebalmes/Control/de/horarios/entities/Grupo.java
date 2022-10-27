package net.jaumebalmes.Control.de.horarios.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grupo {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	String grupo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Grupo() {
	}

	public Grupo(Long id, String grupo) {
		super();
		this.id = id;
		this.grupo = grupo;
	}
}
