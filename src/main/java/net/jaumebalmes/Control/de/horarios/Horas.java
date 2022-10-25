package net.jaumebalmes.Control.de.horarios;



public class Horas {

Alumne Alumnes;

int UF;
double totalHoras;
double TotalFaltas;


public Alumne getEstudiante() {
	return Alumnes;
}
public void setEstudiante(Alumne Alumnes) {
	this.Alumnes = Alumnes;
}
public int getUF() {
	return UF;
}
public void setUF(int uF) {
	UF = uF;
}
public double getTotalHoras() {
	return totalHoras;
}
public void setTotalHoras(double totalHoras) {
	this.totalHoras = totalHoras;
}
public double getTotalFaltas() {
	return TotalFaltas;
}
public void setTotalFaltas(double totalFaltas) {
	TotalFaltas = totalFaltas;
}

	public Horas(Alumne alumnes, int UF, double totalHoras, double totalFaltas) {
		Alumnes = alumnes;
		this.UF = UF;
		this.totalHoras = totalHoras;
		TotalFaltas = totalFaltas;
	}
}
