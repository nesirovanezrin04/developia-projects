package com.developia.librariann_nezrin_nesirova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developia.librariann_nezrin_nesirova.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

}