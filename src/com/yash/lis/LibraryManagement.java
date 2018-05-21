package com.yash.lis;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.yash.lis.model.Book;
import com.yash.lis.model.Location;
import com.yash.lis.service.LibrarianService;
import com.yash.lis.serviceimpl.LibrarianServiceImpl;

/**
 * LibraryManagement class will display Librarian's Menu, take input and display
 * output as per the functionality chosen by librarian.
 * 
 * @author Shweta.baberia
 * 
 */

public class LibraryManagement {
	/**
	 * logger is used for logging and to write messages to the configured log
	 * files
	 */
	private Logger logger = Logger.getLogger(LibraryManagement.class);

	/**
	 * Scanner is used for taking input from console
	 */
	private Scanner scanner;

	/**
	 * book reference for holding book details
	 */
	private Book book;
	/**
	 * location reference for holding book location details
	 */
	private Location location;
	/**
	 * LibrarianService for using services @see {@link LibrarianService}
	 */
	private LibrarianService librarianService;

	public LibraryManagement() {
		scanner = new Scanner(System.in);
		book = new Book();
		location = new Location();
		librarianService = new LibrarianServiceImpl();
	}

	/**
	 * getLibrarianMenu method will display Librarian menu which provides
	 * different functionalities and will call the functionality on the basis of
	 * user input
	 */
	public void getLibrarianMenu() {
		String choice;
		do {
			logger.info(
					"\nEnter your choice: \n 1: Add book \n 2: List books \n 3: Remove book \n 4: Edit book \n 5: Search book");
			int key = scanner.nextInt();
			switch (key) {
			case 1:
				Book bookDetails = getBookDetails();
				book = librarianService.addBook(bookDetails);
				System.out.println(book.getTitle() + " book is added ");
				break;
			case 2:
				List<Book> bookList = librarianService.getAllBooks();
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;
			case 3:
				scanner.nextLine();
				logger.info("Enter Book name");
				book.setTitle(scanner.nextLine());
				librarianService.removeBook(book);
				break;
			case 4:
				bookDetails = getBookDetails();
				librarianService.updateBook(bookDetails);
				break;
			case 5:
				scanner.nextLine();
				System.out.println("Enter Book name to be searched");
				String searchText = scanner.nextLine();
				if (librarianService.searchBook(searchText) == null) {
					logger.error("Book Not Found 404");
				}
				break;
			default:
				logger.error("Invalid Choice");
			}
			System.out.println("Do you want continue?Y/N");
			choice = scanner.next();
		} while (choice.equalsIgnoreCase("y"));
	}

	/**
	 * getBookDetails method will display book details form and take book
	 * details in book object
	 * 
	 * @return book object holding book details
	 */
	private Book getBookDetails() {
		System.out.println("Enter Book name");
		scanner.nextLine();
		scanner.nextLine();
		System.out.println("Enter Book id");
		book.setId(scanner.nextInt());
		book.setTitle(scanner.nextLine());
		System.out.println("Enter author name");
		book.setAuthorName(scanner.nextLine());
		System.out.println("Enter Book's  section name");
		location.setSection(scanner.nextLine());
		System.out.println("Enter Book's shelf number");
		location.setShelfNumber(scanner.nextLine());
		book.setLocation(location);
		return book;
	}
}
