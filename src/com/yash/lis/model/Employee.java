package com.yash.lis.model;

/**
 * Employee class acts as data traveler. It represents an entity Employee having
 * states id, name and designation.
 * 
 * @author Shweta.baberia
 *
 */
public class Employee {

	/**
	 * represents id of employee
	 */
	private int id;

	/**
	 * represents name of employee
	 */
	private String name;

	/**
	 * represents designation of employee
	 */
	private String designation;

	/**
	 * Initializes a newly created object so that it represents an empty
	 * employee entity. For invocation by subclass constructors.
	 */
	public Employee() {
	}

	/**
	 * Initializes a newly created object so that it represents a employee
	 * entity with all its states.
	 * 
	 * @param id
	 * @param name
	 * @param designation
	 */
	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
}
