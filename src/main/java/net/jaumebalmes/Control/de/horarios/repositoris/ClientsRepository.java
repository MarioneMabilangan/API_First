package net.jaumebalmes.Control.de.horarios.repositoris;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import net.jaumebalmes.Control.de.horarios.entities.Alumne;

public interface ClientsRepository extends CrudRepository<Alumne, Long>{
	
	public List<Alumne> findAll();
}
