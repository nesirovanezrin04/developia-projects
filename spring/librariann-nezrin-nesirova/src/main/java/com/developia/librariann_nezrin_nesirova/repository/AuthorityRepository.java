package com.developia.librariann_nezrin_nesirova.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.developia.librariann_nezrin_nesirova.entity.AuthorityEntity;
import jakarta.transaction.Transactional;

@Transactional
public interface AuthorityRepository extends JpaRepository<AuthorityEntity, Integer> {   
	/// NATIVE QUERY

	@Query(value = "insert into authorities (username,authority) select ?1,"
			+ "authority from authority_list where librarian=1", nativeQuery = true)
	@Modifying
	void addLibrarianAuthorities(String username);
	
	@Query(value = "insert into authorities (username,authority) select ?1,"
			+ "authority from authority_list where student=1", nativeQuery = true)
	@Modifying
	void addStudentAuthorities(String username);



}
