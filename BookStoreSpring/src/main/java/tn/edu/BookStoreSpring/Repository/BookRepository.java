package tn.edu.BookStoreSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.edu.BookStoreSpring.DOA.Book;



@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {

}
