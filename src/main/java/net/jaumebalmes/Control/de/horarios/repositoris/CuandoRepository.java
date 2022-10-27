package net.jaumebalmes.Control.de.horarios.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.Control.de.horarios.entities.Cuando;

public interface CuandoRepository extends CrudRepository<Cuando,Long> {
	public List<Cuando> findAll();
}
