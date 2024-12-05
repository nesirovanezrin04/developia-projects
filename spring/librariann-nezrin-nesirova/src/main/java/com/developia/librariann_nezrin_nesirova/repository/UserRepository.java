package com.developia.librariann_nezrin_nesirova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developia.librariann_nezrin_nesirova.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
