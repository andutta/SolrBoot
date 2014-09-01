package com.example.solr.book.repository;

import java.util.List;

import org.springframework.data.repository.Repository;
import org.springframework.data.solr.repository.Query;

import com.example.solr.book.model.Book;

public interface BookRepository extends Repository<Book, String> {
	
	@Query("id:?0")
	List<Book> findById(String id);

}
