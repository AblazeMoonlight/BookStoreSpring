package tn.edu.BookStoreSpring.Service;

import java.util.List;

import tn.edu.BookStoreSpring.DOA.Book;

public interface UserFavoriteBookService {
	List<Book> retrieveUserFavoriteBooks();
	void addBookToFavorite(Book b);
	void RemoveFromFavorites(Book b);
	
	
	
}
