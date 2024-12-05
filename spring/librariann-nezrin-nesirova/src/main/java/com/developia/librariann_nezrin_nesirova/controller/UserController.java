package com.developia.librariann_nezrin_nesirova.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.developia.librariann_nezrin_nesirova.exception.MyException;
import com.developia.librariann_nezrin_nesirova.request.LibrarianAddRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*") // csrf=active
public class UserController {

	@Autowired
	private com.developia.librariann_nezrin_nesirova.service.UserService service;

	// api web api veb servis
	@PostMapping(path = "/librarians")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String addSeller(@Valid @RequestBody LibrarianAddRequest req, BindingResult br) {
		if (br.hasErrors()) {
			throw new MyException("nese var", br);
		}
		service.addLibrarian(req);
		return "successfully";
	}

}
