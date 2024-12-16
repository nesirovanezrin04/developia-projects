package com.developia.librariann_nezrin_nesirova.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.developia.librariann_nezrin_nesirova.entity.LibrarianEntity;
import com.developia.librariann_nezrin_nesirova.repository.LibrarianRepository;
import com.developia.librariann_nezrin_nesirova.request.LibrarianAddRequest;

@Service
public class LibrarianService {

	@Autowired
	private LibrarianRepository repository;

	public void add(LibrarianAddRequest req) {
		LibrarianEntity librarian = new LibrarianEntity();
		librarian.setAddress(req.getAddress());
		librarian.setEmail(req.getEmail());
		librarian.setName(req.getName());
		librarian.setUsername(req.getUsername());
		librarian.setPhone(req.getPhone());
		librarian.setRegisterDate(LocalDateTime.now());
		librarian.setSurname(req.getSurname());
		repository.save(librarian);

	}

	public Integer findIdByUsername() {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		LibrarianEntity librarian = repository.findByUsername(username);
		Integer id = librarian.getId();
		return id;

	}
	



}