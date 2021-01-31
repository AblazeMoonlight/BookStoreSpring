package tn.edu.BookStoreSpring.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.edu.BookStoreSpring.DOA.Book;



@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
@Query(nativeQuery = true, value = "SELECT * FROM Book TB  WHERE TB.category=:category LIMIT 1 ")
Book findBookBySuggCategory(
		  @Param("category") String category);

}
