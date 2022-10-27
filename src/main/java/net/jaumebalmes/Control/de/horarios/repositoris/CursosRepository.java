package net.jaumebalmes.Control.de.horarios.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.Control.de.horarios.entities.Cursos;

public interface CursosRepository extends CrudRepository<Cursos,Long> {
	public List<Cursos> findAll();
}
