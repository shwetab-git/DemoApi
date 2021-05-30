package com.example.CrudOperation.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Books")
public class Books {
	@Id
	@GeneratedValue
	private Integer bookid;
	private String bookName;
	private String authorname;
	private Integer price;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Books(Integer bookid, String bookName, String authorname, Integer price) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.authorname = authorname;
		this.price = price;
	}
	public Books() 
	{}
	
	

}
