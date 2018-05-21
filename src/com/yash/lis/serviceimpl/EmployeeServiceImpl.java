package com.yash.lis.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;

import com.yash.lis.daoimpl.BookRepositoryImpl;
import com.yash.lis.model.Book;
import com.yash.lis.service.EmployeeService;

/**
 * EmployeeServiceImpl implements EmployeeService interface. It will provide
 * employee related services. These services will be common to all the
 * employees(Librarian, members and non-members) of an organization. We have
 * search method which is common to all the employees.
 * 
 * @author Shweta.baberia
 */
public class EmployeeServiceImpl implements EmployeeService {

	/**
	 * logger is used for logging and to write messages to the configured log
	 * files
	 */
	private static Logger logger = Logger.getLogger(EmployeeServiceImpl.class);

	/**
	 * bookRepository used to get bookRepository (list of existing books) from
	 * BookRepositoryImpl
	 * 
	 * @see BookRepositoryImpl
	 */
	private BookRepositoryImpl bookRepository = BookRepositoryImpl.getBookRepository();

	/**
	 * searchBook method present in employeeService is implemented over here.
	 * Search is performed on the basis of book name
	 * 
	 * @param searchText
	 * @return resultBook
	 * @see BookRepositoryImpl
	 */
	@Override
	public Book searchBook(String searchText) {
		List<Book> books = bookRepository.getAllBooks();
		Book resultBook = null;
		for (Book book : books) {
			if (book.getTitle().equalsIgnoreCase(searchText)) {
				logger.info("searched Book Found");
				logger.info("Book name: " + book.getTitle() + "\n" + "Author name:" + book.getAuthorName()
						+ "\nSection:" + book.getLocation().getSection() + "\nShelf number:"
						+ book.getLocation().getShelfNumber());
				resultBook = book;
			}
		}
		return resultBook;
	}

}
