package com.yash.lis;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.yash.lis.model.Employee;
import com.yash.lis.model.Librarian;

/**
 * This class contain main method for start up
 * 
 * @author Shweta.baberia
 *
 */
public class App {
	/**
	 * logger is used for logging and to write messages to the configured log
	 * files
	 */
	private static Logger logger = Logger.getLogger(App.class);

	/**
	 * Application will start from here
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Employee librarian = new Librarian(100, "Shweta", "Management");
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		logger.info("********************************************");
		logger.info("  Welcome to Library Information Management System ");
		logger.info("********************************************");
		while (count < 3) {
			count++;
			System.out.println("Enter user name");
			String name = scanner.nextLine();
			if (librarian.getName().equals(name)) {
				LibraryManagement librarianFunctionality = new LibraryManagement();
				librarianFunctionality.getLibrarianMenu();
			} else {
				logger.error("Please enter valid credentials! Try Again");
			}

			if (count == 3) {
				logger.error("Invalid attempt exceeds");
			}
		}

		scanner.close();

	}
}
