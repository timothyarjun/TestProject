package com.spring.testpro.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.testpro.entity.Book;
import com.spring.testpro.repository.BookRepository;

@Service
public class BookService {

	private BookRepository bookRepository;

	@Autowired
	public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	public Book registerBook(Book book) {
		return bookRepository.save(book);
	}

	public List<Book> getAll(Set<Integer> yop, String bookType, float min, float max) {
		// List<Book> bookList = new ArrayList<Book>();
		if (yop == null)
			return bookRepository.findAll();
		
		else if (min !=0 && max !=0)
			return bookRepository.findAllByPriceBetween(min,max);
		else
			return bookRepository.findAllByYearOfPublicationInAndBookType(yop, bookType);
	}

	public Optional<Book> getOne(long id) {
		return bookRepository.findById(id);
	}

	public String deleteOne(long id) {
		if(getOne(id)!=null) {
			bookRepository.deleteById(id);
			return "Record Deleted Successfully.....";
		}			
		else
			return "Id is Invalid now id value is null";
	}	
}
