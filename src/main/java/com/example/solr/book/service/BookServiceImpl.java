package com.example.solr.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solr.book.model.Book;
import com.example.solr.book.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> findById(String id) {
		System.out.println("Inside Service" + bookRepository.toString());
		return bookRepository.findById(id);
		
	}

}
