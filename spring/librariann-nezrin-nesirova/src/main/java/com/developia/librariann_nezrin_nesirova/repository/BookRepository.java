package com.developia.librariann_nezrin_nesirova.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.developia.librariann_nezrin_nesirova.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {
	
	@Query(value = "select * from books where librarian_id=?1 and name like %?2%", nativeQuery = true)
	List<BookEntity> findBooks(Integer librarianId, String query);



}
