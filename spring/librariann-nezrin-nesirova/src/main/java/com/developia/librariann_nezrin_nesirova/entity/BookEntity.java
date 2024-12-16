package com.developia.librariann_nezrin_nesirova.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
	@Table(name = "books")
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class BookEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		private String name;
		private Double price;
		private LocalDate publishDate;
		private LocalDateTime registerDate;
		private Integer quantity;
		private Integer sellerId;
		private Integer LibrarianId;
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
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public LocalDate getPublishDate() {
			return publishDate;
		}
		public void setPublishDate(LocalDate publishDate) {
			this.publishDate = publishDate;
		}
		public LocalDateTime getRegisterDate() {
			return registerDate;
		}
		public void setRegisterDate(LocalDateTime registerDate) {
			this.registerDate = registerDate;
		}
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
		public Integer getSellerId() {
			return sellerId;
		}
		public void setSellerId(Integer sellerId) {
			this.sellerId = sellerId;
		}
		public Integer getLibrarianId() {
			return LibrarianId;
		}
		public void setLibrarianId(Integer librarianId) {
			LibrarianId = librarianId;
		}

		
		
	}

