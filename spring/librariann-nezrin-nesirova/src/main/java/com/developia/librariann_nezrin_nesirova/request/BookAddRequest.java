package com.developia.librariann_nezrin_nesirova.request;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;

@Data
public class BookAddRequest {

	@NotNull(message = "Ad mutleqdir")
	@NotBlank(message = "Adi bos qoymaq olmaz")
	private String name;

	private String author; 

	private String description;

	@NotNull(message = "Nesr tarixi mutleqdir")
	@Past
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate publishDate;

	private Double price;

	private String imageName;

}
