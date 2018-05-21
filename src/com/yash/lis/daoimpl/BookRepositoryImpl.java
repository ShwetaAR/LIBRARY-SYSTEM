package com.yash.lis.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.yash.lis.dao.BookRepository;
import com.yash.lis.model.Book;
import com.yash.lis.model.Location;
/**
 * This class implements BookRepository interface and provide Book repository  
 * 
 * @author Shweta.baberia
 *
 */
public class BookRepositoryImpl implements BookRepository {
	
	
	/**
	 * logger is used for logging
	 *  and  to write messages to the configured log files
	 */
	private static Logger logger = Logger.getLogger(BookRepositoryImpl.class);
	/**
	 * Temporary Book repository which will hold book object
	 */
	private List<Book> books;
	/**
	 * bookRepository  used to get bookRepository(list of existing books)
	 * 
	 */
	private static BookRepositoryImpl bookRepository= new BookRepositoryImpl();
	/**
	 * BookRepositoryImpl method is used to getBookRepository
	 * @return bookRepository
	 */
	public static BookRepositoryImpl getBookRepository(){
		return bookRepository;
	}
	/**
	 * BookRepositoryImpl constructor performs operations required to initialize the class before methods are
	 * invoked or fields are accessed.
	 * It creates list of book at the time of  initialization the class
	 */
	public BookRepositoryImpl() {
		books= new ArrayList<>();
		books.add(new Book(101, "Shweta", "HeadFirst", new Location("D101", "Java"),false));
		books.add(new Book(102, "Masoom", "Java5", new Location("D101", "Java"),true));
		books.add(new Book(103, "Maithili", "PHP", new Location("D201", "PHP"),true));
		books.add(new Book(104, "Minerva", "Wisdom of Goddess", new Location("D501", "Nature"),false));
		books.add(new Book(105, "Yash", "Instagram", new Location("D601", "Social"),false));
		books.add(new Book(106, "Soumya", "Use Case", new Location("D701", "UML"),false));
	}
	/**
	 * getAllBooks method used to fetch all the books that exist in repository
	 * 
	 * @return list of books
	 */
	@Override
	public List<Book> getAllBooks() {
		return books;
		
	}
	
	
	/**
	 * saveBook method is used to add book given by used into list of books.
	 *  List<Book> books;
	 * @param book
	 */
	@Override
	public Book saveBook(Book book) {
		books.add(book);
		return book;

	}
	
	

	/**
	 * deleteBook method is used to remove book from the bookList
	 * List<Book> books
	 * @param book
	 */
	@Override
	public boolean deleteBook(Book book) {
		return books.remove(book);
	}
	
	/**
	 * editBook  method is used to edit book provided by the user.
	 * @param book
	 */
	@Override
	public void editBook(Book book) {
		boolean isEdited = false;
		for (Book bookInR : books) {
			if(bookInR.getId()==book.getId()){
				bookInR.setTitle(book.getTitle());
				bookInR.setLocation(book.getLocation());
				isEdited = true;
				break;
			}}
		if(!isEdited){
			logger.error("No book found to update");
		}
		else {
			System.out.println(book.getTitle()+" Book Updated");
		}
	}
	

	
}
