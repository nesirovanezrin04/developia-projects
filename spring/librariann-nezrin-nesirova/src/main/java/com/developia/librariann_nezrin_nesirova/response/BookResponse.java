package com.developia.librariann_nezrin_nesirova.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookResponse {
	private Integer id;
	private String name;
	private Double price;
}
