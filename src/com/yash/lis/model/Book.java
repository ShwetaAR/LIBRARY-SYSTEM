package com.yash.lis.model;

/**
 * Book class acts as data traveler. 
 * It represents an entity Book having states id, authorName, title, location and  issueStatus.
 * @author Shweta.baberia
 *
 */
public class Book {
	
	/**
	 * represents id of book
	 */
	private int id;
	
	/**
	 * represents authorName of book
	 */
	private String authorName;
	
	/**
	 * represents title of book
	 */
	private String title;
	
	/**
	 * location of book
	 * 
	 * @see com.yash.lis.model.Location 
	 */
	private Location location;
	
	/**
	 * issueBookStatus is used to check if book is issued or not. 
	 *  issueBookStatus=true : book is issued
	 *  issueBookStatus=false : book is not issued and available
	 */
	private boolean issueBookStatus;
	
	/**
	 * Initializes a newly created object so that it represents an empty book entity.
	 * For invocation by subclass constructors. 
	 */
	public Book() {
	}
	
	/**
	 * Initializes a newly created object so that it represents a book entity with all its states.
	 * 
	 * @param id
	 * @param authorName
	 * @param title
	 * @param location
	 * @param issueBookStatus
	 */
	public Book(int id, String authorName, String title, Location location, boolean issueBookStatus) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.title = title;
		this.location = location;
		this.issueBookStatus = issueBookStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public boolean isIssueBookStatus() {
		return issueBookStatus;
	}

	public void setIssueBookStatus(boolean issueBookStatus) {
		this.issueBookStatus = issueBookStatus;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", authorName=" + authorName + ", title=" + title + ", location=" + location
				+ ", issueBookStatus=" + issueBookStatus + "]";
	}
	
}

	
