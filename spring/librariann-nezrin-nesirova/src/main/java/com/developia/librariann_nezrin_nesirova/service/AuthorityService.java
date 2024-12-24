package com.developia.librariann_nezrin_nesirova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developia.librariann_nezrin_nesirova.repository.AuthorityRepository;

@Service
public class AuthorityService {

	@Autowired
	private AuthorityRepository repository;

	public void addLibrarianAuthorities(String username) {
		repository.addLibrarianAuthorities(username);
	}

	public void addStudentAuthorities(String username) {
		repository.addStudentAuthorities(username);
	}

}