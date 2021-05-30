package com.example.dao;

import java.util.List;

import com.example.CrudOperation.Model.Books;

public interface BookDao {
	Books getBookid(int id);

	List<Books> getAllBooks();

	 boolean deletePerson(Books book);

	boolean updatePerson(Books book);

	boolean createPerson(Books book);
	
	String insertBook(List<Books> book);

}
