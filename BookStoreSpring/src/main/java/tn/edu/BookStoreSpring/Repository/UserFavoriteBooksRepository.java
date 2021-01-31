package tn.edu.BookStoreSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.edu.BookStoreSpring.DOA.Book;
import tn.edu.BookStoreSpring.DOA.UserFavoriteBooks;

@Repository

public interface UserFavoriteBooksRepository extends CrudRepository<UserFavoriteBooks,Integer> {

}
