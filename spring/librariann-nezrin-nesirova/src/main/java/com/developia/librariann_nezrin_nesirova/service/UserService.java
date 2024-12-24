package com.developia.librariann_nezrin_nesirova.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developia.librariann_nezrin_nesirova.entity.UserEntity;
import com.developia.librariann_nezrin_nesirova.repository.UserRepository;
import com.developia.librariann_nezrin_nesirova.request.LibrarianAddRequest;
import com.developia.librariann_nezrin_nesirova.request.StudentAddRequest;

import jakarta.validation.Valid;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	@Autowired
	private AuthorityService authorityService;

	@Autowired
	private LibrarianService LibrarianService;
	
	@Autowired
	private StudentService studentService;



	public void addLibrarian(LibrarianAddRequest req) {
		UserEntity user = new UserEntity();
		user.setUsername(req.getUsername());
		user.setPassword("{noop}" + req.getPassword());
		user.setEnabled(1);
		repository.save(user);
		authorityService.addLibrarianAuthorities(req.getUsername());
		LibrarianService.add(req);
		
	}
		public void addStudent(StudentAddRequest req) {
			UserEntity user = new UserEntity();
			user.setUsername(req.getUsername());
			user.setPassword("{noop}" + req.getPassword());
			user.setEnabled(1);
			repository.save(user);
			authorityService.addStudentAuthorities(req.getUsername());
			StudentService.create(req);
		

	}
	

}