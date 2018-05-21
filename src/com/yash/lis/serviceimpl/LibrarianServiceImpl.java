package com.yash.lis.serviceimpl;

import java.util.List;

import org.apache.log4j.Logger;

import com.yash.lis.daoimpl.BookRepositoryImpl;
import com.yash.lis.model.Book;
import com.yash.lis.service.LibrarianService;

/**
 * LibrarianServiceImpl implements LibrarianService interface provides librarian
  related services, like getAllBooks, addBook,removeBook,updateBook.
 * 
 * @author Shweta.baberia
 */
public class LibrarianServiceImpl extends EmployeeServiceImpl implements LibrarianService {
	/**
	 * logger is used for logging and to write messages to the configured log
	 * files
	 */
	private static Logger logger = Logger.getLogger(LibrarianServiceImpl.class);

	/**
	 * bookRepository used to get bookRepository (list of existing books) from
	 * BookRepositoryImpl
	 * 
	 * @see BookRepositoryImpl
	 */
	private BookRepositoryImpl bookRepository = BookRepositoryImpl.getBookRepository();

	/**
	 * getAllBooks method used to fetch all the books that exist in repository
	 * 
	 * @return list of books
	 * @see BookRepositoryImpl
	 */
	@Override
	public List<Book> getAllBooks() {

		return bookRepository.getAllBooks();

	}

	/**
	 * addBook method is used to add book to repository, and it also checks if
	 * book is already present or not. if it is already there then it will
	 * display output as "Book Already Exist" 
          * my changes for master
	 * by book name
	 * 
	 * @see BookRepositoryImpl
	 * @param book
	 */
	@Override
	public Book addBook(Book book) {
		List<Book> books = bookRepository.getAllBooks();
		for (Book book2 : books) {
			if (book2.getTitle() == book.getTitle()) {
				logger.info("Book Already Exist");
				break;
			} else {
				bookRepository.saveBook(book);
				break;
			}
		}
		return book;

	}

	/**
	 * removeBook method is used to remove book on the basis of book name. If
	 * there's no book of that name it will display an error that
	 * "No such Book Found" If that book is issued by someone then it will
	 * display "Book is already issued to User" and If book is present then it
	 * will remove it successfully.
	 * 
	 * @see BookRepositoryImpl
	 * @param book
	 */
	@Override
	public void removeBook(Book book) {
		System.out.println("1" + book.getTitle());
		boolean isRemoved = false;
		List<Book> books = bookRepository.getAllBooks();
		for (Book bookFromRepository : books) {
			if (book.getTitle().equalsIgnoreCase(bookFromRepository.getTitle())) {
				book = bookFromRepository;
			}
		}
		if (book.isIssueBookStatus()) {
			System.out.println("Book is already issued to User");
		} else {
			for (Book bookFromRepository : books) {
				if (book.getTitle().equalsIgnoreCase(bookFromRepository.getTitle())) {
					if (bookRepository.deleteBook(book)) {
						System.out.println("Book Is removed successfully");
						isRemoved = true;
						break;
					}
				}
			}
			if (!isRemoved) {
				logger.error("Such book  does not exist");
			}
		}
	}

	/**
	 * updateBook method is used to update book provided by the user.
	 * 
	 * @see BookRepositoryImpl
	 * @param book
	 */
	@Override
	public void updateBook(Book book) {
		bookRepository.editBook(book);
	}

}
