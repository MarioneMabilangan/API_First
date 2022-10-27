package net.jaumebalmes.Control.de.horarios.config;

import org.modelmapper.ModelMapper;	
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Miconfig{
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}

