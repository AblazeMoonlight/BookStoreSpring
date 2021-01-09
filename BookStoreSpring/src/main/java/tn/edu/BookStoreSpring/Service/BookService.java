package tn.edu.BookStoreSpring.Service;

import java.util.List;

import tn.edu.BookStoreSpring.DOA.Book;



public interface BookService {
	List<Book> retrieveAllBooks();
	Book addBook(Book b);
	void deleteUser(Book b);
	Book updateBook(Book b);
	Book retrieveBook(String id);
	List<Book> retrieveStockBooks();
	List<Book> retrieveTopBooks();
}
