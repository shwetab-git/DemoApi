package com.example.CrudOperation.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.stereotype.Service;

//import com.example.CrudOperation.Controller.EmployeeEntity;
import com.example.CrudOperation.Model.Books;
import com.example.CrudOperation.Repository.BooksRepository;
import com.example.dao.BookDao;
import com.example.dao.BookDaoImpl;

@Service
public class BookService {
	
	
	@Autowired(required=true)
	BooksRepository booksRepository;
	
	@Autowired
	BookDaoImpl bookDao;
	
	public List<Books> getAllBooks()   
	{  
	List<Books> books = new ArrayList<Books>();  
	books=(List<Books>) booksRepository.findAll();  
	return books;  
	}  
	
	public String addBooks()
	{
		booksRepository.save(new Books(1,"Java head first","Shweta",800));
		return "Added";
	}

	public Books findById(Integer id)  {
		// TODO Auto-generated method stub
		Optional<Books> book = booksRepository.findByBookid(id);
		//if(book.isPresent()) {
            return book.get();
         //else {
        /*    throw new Exception("No employee record exist for given id");
        }*/
	
	

}

	public Books insertBook(Books books) {
		// TODO Auto-generated method stub
	            return booksRepository.save(books);
	            
	            }
	
	public Books updateBook(Books books)
	{
		return booksRepository.save(books);
	}

	public String insertBooks(List<Books> books) {
		// TODO Auto-generated method stub
		String result = null;  
		for(Books book : books) {
			boolean response = bookDao.createPerson(book);
			if(response == true) {
				result = "inserted";
			}
		}
		return result;
	}
	
	public boolean createPerson(Books book) {
		return bookDao.createPerson(book);
	}
	
	public String insertBook(List<Books> book) {
		
		return bookDao.insertBook(book);
		//return "data inserted successfully";
		}

	public ResponseEntity getBookById(Integer id)  {
		// TODO Auto-generated method stub
		return null ;
	}
	
	}

	


