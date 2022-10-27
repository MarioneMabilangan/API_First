package net.jaumebalmes.Control.de.horarios.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cursos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String curs;
	private String grupsCurs;
	private String aula;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurs() {
		return curs;
	}

	public void setCurs(String cursos) {
		this.curs = curs;
	}

	public String getGrupsCurs() {
		return grupsCurs;
	}

	public void setGrupsCurs(String grupsCurs) {
		this.grupsCurs = grupsCurs;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public Cursos() {		
	}

	public Cursos(String curs, String grupsCurs, String aula) {
		super();
		this.curs = curs;
		this.grupsCurs = grupsCurs;
		this.aula = aula;
	}
	
}