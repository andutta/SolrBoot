package com.example.solr.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.solr.book.model.Book;


public interface BookService {
	
	List<Book> findById(String id);

}
