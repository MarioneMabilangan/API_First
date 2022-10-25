package net.jaumebalmes.Control.de.horarios;

public class Grupos {

	String cursos;
	String GrupoCurso;
	String aula;

	public Grupos(String cursos, String grupoCurso, String aula) {
		super();
		this.cursos = cursos;
		GrupoCurso = grupoCurso;
		this.aula = aula;
	}

	public String getCursos() {
		return cursos;
	}

	public void setCursos(String cursos) {
		this.cursos = cursos;
	}

	public String getGrupoCurso() {
		return GrupoCurso;
	}

	public void setGrupoCurso(String grupoCurso) {
		GrupoCurso = grupoCurso;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

}
