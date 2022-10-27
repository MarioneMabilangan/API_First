package net.jaumebalmes.Control.de.horarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.transform.impl.AddDelegateTransformer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.jaumebalmes.Control.de.horarios.AlumneDTOConverter.AlumneDTOConverter;
import net.jaumebalmes.Control.de.horarios.dto.AlumneDTO;
import net.jaumebalmes.Control.de.horarios.dto.CreateAlumneDTO;
import net.jaumebalmes.Control.de.horarios.entities.Alumne;
import net.jaumebalmes.Control.de.horarios.entities.Cuando;
import net.jaumebalmes.Control.de.horarios.entities.Grupo;
import net.jaumebalmes.Control.de.horarios.entities.Cursos;
import net.jaumebalmes.Control.de.horarios.repositoris.ClientsRepository;
import net.jaumebalmes.Control.de.horarios.repositoris.CuandoRepository;
import net.jaumebalmes.Control.de.horarios.repositoris.CursosRepository;
import net.jaumebalmes.Control.de.horarios.repositoris.GrupoRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class ClientController {
	
	@Autowired
	GrupoRepository grupoRep;
	@Autowired
	CursosRepository cursosRep;
	@Autowired
	ClientsRepository clientRep;
	@Autowired
	CuandoRepository cuandoRep;
	
	private final AlumneDTOConverter alumneDTOconverter = new AlumneDTOConverter();
	
	@GetMapping("/alumnes")
	public ResponseEntity<?> getAlumnes() {
		List<Alumne> result = clientRep.findAll();
		
		if (result.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			List<AlumneDTO> dtoList = result.stream().map(alumneDTOconverter::convertToDto).collect(Collectors.toList());
			return ResponseEntity.ok(dtoList);
		}
	}

	@GetMapping("/alumnes/{id}")
	public ResponseEntity<?> getnAlumnes(@PathVariable long id) {
		Alumne alumne = clientRep.findById(id).orElse(null);
		if(alumne == null) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(alumne);
		}
	}
	
	@PostMapping("/alumnes")
	public ResponseEntity<?> altaAlumne(@RequestBody CreateAlumneDTO alumne) {
		Alumne newAlumne = new Alumne();
		
		newAlumne.setNom(alumne.getNom());
		newAlumne.setCognoms(alumne.getCognoms());
		newAlumne.setEmail(alumne.getEmail());
		Grupo grupo = grupoRep.findById(alumne.getGrupoId()).orElse(null);
		newAlumne.setGrupo(grupo);
		return ResponseEntity.status(HttpStatus.CREATED).body(clientRep.save(newAlumne));
	}
	
	@DeleteMapping("/alumnes/{id}")
	public ResponseEntity<?> baixaAlumne(@PathVariable long id) {
		clientRep.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/alumnes/{id}")
	public ResponseEntity<?> cambiaAlumne(@RequestBody Alumne alumne, @PathVariable long id) {
		return clientRep.findById(id).map(a -> {
			a.setNom(alumne.getNom());
			a.setCognoms(alumne.getCognoms());
			a.setEmail(alumne.getEmail());
			return ResponseEntity.ok(clientRep.save(a));
		}).orElseGet(() -> {
			return ResponseEntity.notFound().build();
		});
	}
	
	@GetMapping("/cursos")
	public ResponseEntity<?> getcursos() {
		List<Cursos> result = cursosRep.findAll();
		
		if (result.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(result);
		}
	}
	
	@GetMapping("/cursos/{id}")
	public ResponseEntity<?> getncursos(@PathVariable long id) {
		Cursos curso = cursosRep.findById(id).orElse(null);
		if(curso == null) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(curso);
		}
	}
	
	@PostMapping("/cursos")
	public ResponseEntity<?> altacursos(@RequestBody Cursos curs) {
		Cursos nou = cursosRep.save(curs);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(nou);
	}
	
	@DeleteMapping("/cursos/{id}")
	public ResponseEntity<?> baixaCurs(@PathVariable long id) {
		cursosRep.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/producto/{id}")
	public ResponseEntity<?> editarProducto(@RequestBody Cursos editar, @PathVariable Long id) {

		return cursosRep.findById(id).map(c -> {
			c.setCurs(editar.getCurs());
			c.setGrupsCurs(editar.getGrupsCurs());
			c.setAula(editar.getAula());		
			return ResponseEntity.ok(cursosRep.save(c));
		}).orElseGet(() -> {
			return ResponseEntity.notFound().build();
		});
	}
	
	@GetMapping("/cuando")
	public ResponseEntity<?> getCuando() {
		List<Cuando> result = cuandoRep.findAll();
		
		if (result.isEmpty()) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(result);
		}
	}
	
	@GetMapping("/cuando/{id}")
	public ResponseEntity<?> getncuando(@PathVariable long id) {
		Cuando cuando = cuandoRep.findById(id).orElse(null);
		if(cuando == null) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok(cuando);
		}
	}
	
	@PostMapping("/cuando")
	public ResponseEntity<?> altacuando(@RequestBody Cuando cuando) {
		Cuando nou = cuandoRep.save(cuando);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(nou);
	}
	
	@DeleteMapping("/cuando/{id}")
	public ResponseEntity<?> baixaCuando(@PathVariable long id) {
		cuandoRep.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/cuando/{id}")
	public ResponseEntity<?> editarCuando(@RequestBody Cuando editar, @PathVariable Long id) {
		return cuandoRep.findById(id).map(c -> {
			c.setEntrada(editar.getEntrada());
			c.setSalida(editar.getSalida());
			c.setAlumne(editar.getAlumne());
			c.setCursos(editar.getCursos());
			return ResponseEntity.ok(cuandoRep.save(c));
		}).orElseGet(() -> {
			return ResponseEntity.notFound().build();
		});
	}
}
