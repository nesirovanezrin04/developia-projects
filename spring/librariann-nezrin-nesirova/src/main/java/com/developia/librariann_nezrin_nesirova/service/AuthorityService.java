package com.developia.librariann_nezrin_nesirova.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.developia.librariann_nezrin_nesirova.entity.AuthorityEntity;
import jakarta.transaction.Transactional;


@Transactional
public interface AuthorityService extends JpaRepository<AuthorityEntity, Integer> {
	/// NATIVE QUERY

	@Query(value = "insert into authorities (username,authority) select ?1,"
			+ "authority from authority_list where seller=1", nativeQuery = true)
	@Modifying
	void addSellerAuthorities(String username);

}
