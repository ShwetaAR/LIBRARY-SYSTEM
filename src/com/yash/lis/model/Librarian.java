package com.yash.lis.model;

/**
 * Librarian class is an entity which extends states and behavior of employee.
 * 
 * @author Shweta.baberia
 *
 */
public class Librarian extends Employee {

	/**
	 * Initializes a newly created object so that it represents an empty
	 * librarian entity. It calls super class Employee's constructor. For
	 * invocation by subclass constructors.
	 */
	public Librarian() {
		super();
	}

	/**
	 * Initializes a newly created object so that it represents a librarian
	 * entity with all its states. It calls super class Employee's parameterized
	 * constructor.
	 * 
	 * @param id
	 * @param name
	 * @param department
	 */
	public Librarian(int id, String name, String department) {
		super(id, name, department);
	}

}
