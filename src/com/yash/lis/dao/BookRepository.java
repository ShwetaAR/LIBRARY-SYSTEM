package com.yash.lis.dao;

import java.util.List;

import com.yash.lis.model.Book;
/**
 * BookRepository interface will provide book related CRUD operations
 * 
 * @author Shweta.baberia
 *
 */
public interface BookRepository {

	public List<Book> getAllBooks();
	
	public Book saveBook(Book book);
	
	public boolean deleteBook(Book book);
	
	public void editBook(Book book);
}
