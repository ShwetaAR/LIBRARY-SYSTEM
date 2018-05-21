package com.yash.lis.service;

import java.util.List;

import com.yash.lis.model.Book;
/**
 * LibrarianService is an interface used to declare methods 
 * related to services of librarian.
 * @author Shweta.baberia
 *
 */
public interface LibrarianService extends EmployeeService {
	
	public List<Book> getAllBooks();
	
	public Book addBook(Book book);
	
	public void removeBook(Book book);
	
	public void updateBook(Book book);
	
}
