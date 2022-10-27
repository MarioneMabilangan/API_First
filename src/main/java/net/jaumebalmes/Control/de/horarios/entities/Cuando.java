package net.jaumebalmes.Control.de.horarios.entities;

import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cuando {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
    private String entrada = String.valueOf(new SimpleDateFormat("HH:mm:ss"));
    private String salida = String.valueOf(new SimpleDateFormat("HH:mm:ss"));
    
    @ManyToOne
    @JoinColumn(name="alumne_id")
    private Alumne alumne;
    
    @ManyToOne
    @JoinColumn(name="aula_id")
    private Cursos cursos;

    public Cuando() {
	}

	public Cuando(String entrada, String salida, Alumne alumne, Cursos cursos) {
		super();
		this.entrada = entrada;
		this.salida = salida;
		this.alumne = alumne;
		this.cursos = cursos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Alumne getAlumne() {
		return alumne;
	}

	public void setAlumne(Alumne alumne) {
		this.alumne = alumne;
	}

	public Cursos getCursos() {
		return cursos;
	}

	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}   
}
