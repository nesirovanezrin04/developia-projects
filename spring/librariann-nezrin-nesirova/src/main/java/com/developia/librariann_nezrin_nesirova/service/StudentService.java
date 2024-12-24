package com.developia.librariann_nezrin_nesirova.service;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.developia.librariann_nezrin_nesirova.entity.StudentEntity;
import com.developia.librariann_nezrin_nesirova.repository.StudentRepository;
import com.developia.librariann_nezrin_nesirova.request.StudentAddRequest;
import com.developia.librariann_nezrin_nesirova.response.MessageResponse;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

	private final StudentRepository studentRepository;
	private final ModelMapper modelMapper;

	public ResponseEntity<MessageResponse> create(StudentAddRequest req) {
		StudentEntity student = new StudentEntity();
		modelMapper.map(req, student);
		student.setRegisterDate(LocalDateTime.now());
		studentRepository.save(student);

		MessageResponse response = new MessageResponse();
		response.setMessage("Created Successfully");

		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

}