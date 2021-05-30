package com.example.dao;
import com.example.CrudOperation.Model.BookMapper;
import java.util.List;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.CrudOperation.Model.Books;

@Repository
public class BookDaoImpl implements BookDao{
	
	
	       
	
        @Autowired
		JdbcTemplate jdbcTemplate;

		private final String SQL_FIND_PERSON = "select * from books where id = ?";
		private final String SQL_DELETE_PERSON = "delete from books where id = ?";
		private final String SQL_UPDATE_PERSON = "update books set first_name = ?, last_name = ?, age  = ? where id = ?";
		private final String SQL_GET_ALL = "select * from books";
		private final String SQL_INSERT_PERSON = "insert into books(bookid, authorname, book_name, price) values(?,?,?,?)";

		@Autowired
		public BookDaoImpl(DataSource dataSource) {
			jdbcTemplate = new JdbcTemplate(dataSource);
		}

		/*
		public Books getPersonById(Long id) {
			return jdbcTemplate.queryForObject(SQL_FIND_PERSON, new Object[] { id }, new PersonMapper());
		}

		public List<Books> getAllPersons() {
			return jdbcTemplate.query(SQL_GET_ALL, new PersonMapper());
		}
        */
		public boolean deletePerson(Books book) {
			return jdbcTemplate.update(SQL_DELETE_PERSON, book.getBookid()) > 0;
		}

		public boolean updatePerson(Books book) {
			return jdbcTemplate.update(SQL_UPDATE_PERSON, book.getBookid(), book.getBookName(), book.getAuthorname(),
					book.getPrice()) > 0;
		}

		public boolean createPerson(Books book) {
		
			return  jdbcTemplate.update(SQL_INSERT_PERSON, book.getBookid(), book.getBookName(), book.getAuthorname(),
					book.getPrice()) > 0;
		}
		
		

		@Override
		public Books getBookid(int id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Books> getAllBooks() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String insertBook(List<Books> book) {
			// TODO Auto-generated method stub
			return null;
		}

		
	}


