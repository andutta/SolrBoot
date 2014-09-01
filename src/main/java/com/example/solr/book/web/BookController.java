package com.example.solr.book.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.solr.book.model.Book;
import com.example.solr.book.service.BookService;

@RestController
@Scope("prototype")

public class BookController {

	@Autowired
	private BookService bookService;
	
	@RequestMapping("/")
	public String root(){
		return "ROOT";
		
	}
	
	@RequestMapping(value="/search", produces="application/json")
	public List<Book> search(@RequestParam String value){
		System.out.println(bookService.toString());
		return bookService.findById(value);
		//return new ArrayList<Book>();
	}
	
	

}
