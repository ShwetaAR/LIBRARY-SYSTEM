package com.yash.lis.model;

/**
 * This class acts as data traveler. It represents an entity Location having
 * states shelfNumber, section.
 * 
 * @author Shweta.baberia
 *
 */
public class Location {

	/**
	 * represents shelf number of book
	 */
	private String shelfNumber;

	/**
	 * represents section of the book in a shelf
	 */
	private String section;

	/**
	 * Initializes a newly created object so that it represents an empty
	 * location entity. For invocation by subclass constructors.
	 */
	public Location() {
	}

	/**
	 * Initializes a newly created object so that it represents a location
	 * entity with all its states.
	 * 
	 * @param shelfNumber
	 * @param section
	 */
	public Location(String shelfNumber, String section) {
		super();
		this.shelfNumber = shelfNumber;
		this.section = section;
	}

	public String getShelfNumber() {
		return shelfNumber;
	}

	public void setShelfNumber(String shelfNumber) {
		this.shelfNumber = shelfNumber;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return "Location [shelfNumber=" + shelfNumber + ", section=" + section + "]";
	}

}
