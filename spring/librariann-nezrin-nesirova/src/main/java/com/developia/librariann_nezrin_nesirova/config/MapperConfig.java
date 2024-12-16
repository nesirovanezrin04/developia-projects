package com.developia.librariann_nezrin_nesirova.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MapperConfig {

	@Bean
	public ModelMapper mapper() {
		ModelMapper m = new ModelMapper();
		return m;
	}
}