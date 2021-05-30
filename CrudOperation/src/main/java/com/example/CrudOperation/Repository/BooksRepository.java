package com.example.CrudOperation.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.CrudOperation.Model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer>  {

	Optional<Books> findByBookid(Integer bookid);
}


//native method