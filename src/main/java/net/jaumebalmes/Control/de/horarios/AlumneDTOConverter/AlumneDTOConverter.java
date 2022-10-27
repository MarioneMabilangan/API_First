package net.jaumebalmes.Control.de.horarios.AlumneDTOConverter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import net.jaumebalmes.Control.de.horarios.dto.AlumneDTO;
import net.jaumebalmes.Control.de.horarios.entities.Alumne;

@Component
public class AlumneDTOConverter {
	private final ModelMapper modelMapper = new ModelMapper();
	
	public AlumneDTO convertToDto(Alumne alumne) {
		return modelMapper.map(alumne, AlumneDTO.class);
	}
}
