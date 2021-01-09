package tn.edu.BookStoreSpring.Service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.edu.BookStoreSpring.DOA.Book;
import tn.edu.BookStoreSpring.Repository.BookRepository;


@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookrepository;
	private static final Logger l = LogManager.getLogger(BookServiceImpl.class);
	@Override
	public List<Book> retrieveAllBooks() {
		List<Book> books =(List<Book>) bookrepository.findAll();
		for(Book book:books)
		{
			l.info("Book+++ :" + book);
		}
		return books;
	}

	@Override
	public Book addBook(Book b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Book b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book updateBook(Book b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book retrieveBook(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> retrieveStockBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> retrieveTopBooks() {
		// TODO Auto-generated method stub
		return null;
	}
}
