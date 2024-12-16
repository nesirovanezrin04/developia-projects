package com.developia.librariann_nezrin_nesirova.annotation;


import org.springframework.beans.factory.annotation.Autowired;

import com.developia.librariann_nezrin_nesirova.repository.BookRepository;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EntityIdsiniYoxlaYoxlayici implements ConstraintValidator<EntityIdsiniYoxla, Integer> {

	private String tableName;

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void initialize(EntityIdsiniYoxla a) {
		this.tableName = a.value();
	}

	@Override
	public boolean isValid(Integer id, ConstraintValidatorContext context) {

		boolean present = bookRepository.findById(id).isPresent();
		if (present) {
			return true;
		}
		return false;
	}

}