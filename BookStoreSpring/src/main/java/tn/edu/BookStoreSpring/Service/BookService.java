package tn.edu.BookStoreSpring.Service;

import java.util.List;

import tn.edu.BookStoreSpring.DOA.Book;



public interface BookService {
	List<Book> retrieveAllBooks();
	void addBook(Book b);
	void deleteUser(Book b);
	Book updateBook(Book b);
	void bookSugg();
	List<Book> retrieveStockBooks();
	List<Book> retrieveTopBooks();
	Book retrieveBook(int id);
}
