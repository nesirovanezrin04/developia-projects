package com.developia.librariann_nezrin_nesirova.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	
		private Integer id;
		private String name;
		private String author;
		private String description;
		private LocalDate publishedDate;
		private Double price;
		public Book(Integer id, String name, String author, String description, LocalDate publishedDate, Double price) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.description = description;
			this.publishedDate = publishedDate;
			this.price = price;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public LocalDate getPublishedDate() {
			return publishedDate;
		}
		public void setPublishedDate(LocalDate publishedDate) {
			this.publishedDate = publishedDate;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		
		
	}
