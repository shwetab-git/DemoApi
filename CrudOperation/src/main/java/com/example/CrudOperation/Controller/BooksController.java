package com.example.CrudOperation.Controller;

//import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudOperation.Model.Books;
import com.example.CrudOperation.Repository.BooksRepository;
import com.example.CrudOperation.Service.BookService;
import com.sun.el.stream.Optional;
import com.example.CrudOperation.Service.BookService;
import org.springframework.jdbc.core.JdbcTemplate; 

@RestController
public class BooksController {

	@Autowired(required = true)
	BookService bookService;

	@GetMapping("v1/studyMaterial/getBooks/{id}")
	public ResponseEntity getBookById(Integer id)
	{
		if(id==null)
		{
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		else
		{
			return bookService.getBookById(id);
		}
	}

	@PostMapping("/create")
	public boolean createPerson(@RequestBody Books book)
	{
		return bookService.createPerson(book);
	}
	
	
	@PostMapping("/insert")
	public String insertBook(@RequestBody List<Books> book)
	{
		return bookService.insertBook(book);
	}
	
	@GetMapping(path = "/book1")
	private String getAllBs() {

		return "book1";
	}

	@GetMapping("/book")
	private List<Books> getAllBooks() {

		return bookService.getAllBooks();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Books> findUserById(@PathVariable("id") Integer bookid) {
		// Implement
		Books books = bookService.findById(bookid);
		return new ResponseEntity<Books>(books, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/insertBook")
	public ResponseEntity<Books> insertBook(@RequestBody Books books)
			{
		Books insert = bookService.insertBook(books);
		return new ResponseEntity<Books>(insert, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/insertBooks")
	public ResponseEntity<String> insertBooks(@RequestBody List<Books> books)
			{
		String response = bookService.insertBooks(books);
		return ResponseEntity.ok(response);
	}
	
	@PostMapping("/updateBook")
	public ResponseEntity<Books> updateBook(@RequestBody Books books)
			{
		Books update = bookService.updateBook(books);
		return new ResponseEntity<Books>(update, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/newbook")
	public String addBooks1() {
		return bookService.addBooks();
	}
}
