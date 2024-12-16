package com.developia.librariann_nezrin_nesirova.service;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developia.librariann_nezrin_nesirova.entity.BookEntity;
import com.developia.librariann_nezrin_nesirova.exception.MyException;
import com.developia.librariann_nezrin_nesirova.repository.BookRepository;
import com.developia.librariann_nezrin_nesirova.repository.LibrarianRepository;
import com.developia.librariann_nezrin_nesirova.request.BookAddRequest;
import com.developia.librariann_nezrin_nesirova.response.BookListResponse;
import com.developia.librariann_nezrin_nesirova.response.BookResponse;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;
	
	@Autowired
	private LibrarianRepository librarianRepository;

	@Autowired
	private LibrarianService librarianService;



	@Autowired
	private ModelMapper mapper;

	public BookResponse findById(Integer id) {
		BookResponse resp = new BookResponse();
		BookEntity book = repository.findById(id).orElseThrow(() -> new MyException("id not found", null));

		mapper.map(book, resp);
		return resp;
	}

	public Integer add(BookAddRequest req) {
		BookEntity en = new BookEntity();
		mapper.map(req, en);

		en.setRegisterDate(LocalDateTime.now());

		en.setLibrarianId(librarianService.findIdByUsername());
		repository.save(en);
		return en.getId();

	}
	
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	public BookListResponse findBooks(String query) {
		BookListResponse resp = new BookListResponse();

		List<BookEntity> books = repository.findBooks(librarianService.findIdByUsername(), query);

		List<BookResponse> dtos = new ArrayList<BookResponse>();

		for (BookEntity en : books) {
			BookResponse r = new BookResponse();
			mapper.map(en, r);
			dtos.add(r);
		}

		resp.setBooks(dtos);
		return resp;

	}



}