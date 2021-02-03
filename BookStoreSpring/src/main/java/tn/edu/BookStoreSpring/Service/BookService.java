package tn.edu.BookStoreSpring.Service;

import java.util.List;

import tn.edu.BookStoreSpring.DOA.Book;



public interface BookService {
	List<Book> retrieveAllBooks();
	void addBook(Book b);
	
	Book updateBook(Book b);
	Book findbook(int bookId);
	void addBookWithApi(String isbn);	
	void deleteUser(Book b);
	Book retrieveBook(int id);
}
