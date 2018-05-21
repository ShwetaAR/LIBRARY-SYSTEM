package com.yash.lis.service;

import com.yash.lis.model.Book;
/**
 * EmployeeService interface will provide employee related services.
 * These services will be common to all the employees(Librarian, members and non-members) of an organization.
 * We have search method which is common to all the employees.
 * @author Shweta.baberia
 */
public interface EmployeeService {
	
	public Book searchBook(String searchText);
}
