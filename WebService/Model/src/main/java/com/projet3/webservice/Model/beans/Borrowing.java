package com.projet3.webservice.Model.beans;

import java.util.Date;

public class Borrowing {
	private int id;
	private Date beginningDate;
	private Date endingDate;
	private Book book;
	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getBeginningDate() {
		return beginningDate;
	}
	public void setBeginningDate(Date beginningDate) {
		this.beginningDate = beginningDate;
	}
	public Date getEndingDate() {
		return endingDate;
	}
	public void setEndingDate(Date endingDate) {
		this.endingDate = endingDate;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
