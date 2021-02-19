package com.spring.testpro.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.testpro.entity.Book;
import com.spring.testpro.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		super();
		this.bookService = bookService;
	}

	@PostMapping("/register")
    public Book registerBook(@RequestBody Book book) {
    	return bookService.registerBook(book);
    }
	
	@GetMapping("/getAll")
	public List<Book> getAll(@RequestParam(value = "yearOfPublication", required = false) Set<Integer> yop, @RequestParam(value = "bookType",
	required = false) String bookType, @RequestParam(value = "min", required = false) float min, @RequestParam(value = "max", required = false) float max){
		return bookService.getAll(yop,bookType,min,max);
	}
	
	@GetMapping("/getone/{id}")
	public Optional<Book> getOne(@PathVariable long id) {
		return bookService.getOne(id);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteOne(@PathVariable long id) {
		return bookService.deleteOne(id);
	}
}
