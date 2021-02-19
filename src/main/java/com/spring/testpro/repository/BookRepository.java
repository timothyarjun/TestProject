package com.spring.testpro.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.testpro.entity.Book;
import com.spring.testpro.vm.BookSearchVm;

public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findAllByYearOfPublicationInAndBookType(Set<Integer> yop, String bookType);
		
	List<Book> findAllByPriceBetween(float min, float max);

	//List<Book> findAllByNameLike(String viewModel);

	//List<Book> findAllByYearOfPublicationIn(Set<Integer> yop);

	//List<Book> findAllByYearOfPublication(Integer yop);

	//List<Book> findAllByYearOfPublicationOrBookType(Integer yop, String bookType);	
}
