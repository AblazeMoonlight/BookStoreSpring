package tn.edu.BookStoreSpring.Service;

import java.util.List;

import tn.edu.BookStoreSpring.DOA.Book;

public interface UserFavoriteBookService {
	List<Book> retrieveUserFavoriteBooks(int userId);
	void addBookToFavorite(Book b,int userId);
	void RemoveFromFavorites(Book b,int userId);
	String  bookSugg(int userId);
	
	
	
}
