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
public Horas( Alumne Alumnes, int uF, double totalHoras, double totalFaltas) {
	super();
	this.Alumnes = Alumnes;
	UF = uF;
	this.totalHoras = totalHoras;
	TotalFaltas = totalFaltas;
}
@Override
public String toString() {
	return "Horas [ UF=" + UF + ", totalHoras=" + totalHoras + ", TotalFaltas="
			+ TotalFaltas + "]";
}







}
