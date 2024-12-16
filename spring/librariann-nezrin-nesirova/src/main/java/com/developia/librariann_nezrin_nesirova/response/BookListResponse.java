package com.developia.librariann_nezrin_nesirova.response;

import java.util.List;

import lombok.Data;

@Data
public class BookListResponse {

	private List<BookResponse> books;

	public List<BookResponse> getBooks() {
		return books;
	}

	public void setBooks(List<BookResponse> books) {
		this.books = books;
	}
	
	
}