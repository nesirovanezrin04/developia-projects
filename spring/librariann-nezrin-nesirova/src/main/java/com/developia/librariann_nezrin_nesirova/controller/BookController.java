package com.developia.librariann_nezrin_nesirova.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.developia.librariann_nezrin_nesirova.exception.MyException;
import com.developia.librariann_nezrin_nesirova.model.Book;
import com.developia.librariann_nezrin_nesirova.request.BookAddRequest;
import com.developia.librariann_nezrin_nesirova.request.BookUpdateRequest;
import com.developia.librariann_nezrin_nesirova.response.BookListResponse;
import com.developia.librariann_nezrin_nesirova.response.BookResponse;
import com.developia.librariann_nezrin_nesirova.service.BookService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/books")
public class BookController {

	@Autowired
	private BookService service;


	// /books?q=java
	@GetMapping
	@PreAuthorize(value = "hasAuthority('ROLE_GET_BOOKS_FOR_LIBRARIAN')")
	public BookListResponse findBooks(
			@RequestParam(name = "query", required = false, defaultValue = "java") String query) {

		return service.findBooks(query);

	}

	@PostMapping
	@PreAuthorize(value = "hasAuthority('ROLE_ADD_BOOK')")
	public ResponseEntity<Integer> addBook(@Valid @RequestBody BookAddRequest req, BindingResult br) {
		if (br.hasErrors()) {
			throw new MyException("melumatlarin tamilig pozuldu", br);
		}
		Integer id = service.add(req);
		return ResponseEntity.status(HttpStatus.CREATED).body(id);
		// return new ResponseEntity<Integer>(id, HttpStatus.CREATED);
	}

	@GetMapping(path = "/{id}")
	@PreAuthorize(value = "hasAuthority('ROLE_GET_BOOK')")
	public BookResponse findById(@PathVariable Integer id) {
		return service.findById(id);
	}

	@DeleteMapping(path = "/{id}") // /books/44
	@PreAuthorize(value = "hasAuthority('ROLE_DELETE_BOOK')")
	public void deleteById(@PathVariable Integer id) {
		service.deleteById(id);
	}

	@PutMapping
	@PreAuthorize(value = "hasAuthority('ROLE_UPDATE_BOOK')")
	public ResponseEntity<Void> update(@Valid @RequestBody BookUpdateRequest req, BindingResult br) {
		if (br.hasErrors()) {
			throw new MyException("melumatlarin tamilig pozuldu", br);
		}

		return null;
		// return new ResponseEntity<Integer>(id, HttpStatus.CREATED);
	}


}
