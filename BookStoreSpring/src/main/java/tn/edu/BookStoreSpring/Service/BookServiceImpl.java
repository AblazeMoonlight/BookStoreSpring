package tn.edu.BookStoreSpring.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
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

	
		public void writeToLog(String s) throws IOException
		{ Date date = new Date();
			// create a new file with specified file name
			FileWriter fw = new FileWriter("myFile.log");

			// create the IO strem on that file
			BufferedWriter bw = new BufferedWriter(fw);

			// write a string into the IO stream
			try {
				bw.write(" "+s+" "+date.getTime());
				bw.newLine();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	@Override
	public void addBook(Book b) {
		
		
		bookrepository.save(b);
		try {
			writeToLog("book added"+b.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void deleteUser(Book b) {
		bookrepository.delete(b);
		
	}

	@Override
	@Modifying
	public Book updateBook(Book b) {
		return bookrepository.save(b);
	}

	@Override
	public Book retrieveBook(int id) {
		return bookrepository.findById(id).get();
	}




	@Override
	public void addBookWithApi(String isbn) {
		try {
		Book book=	BookApiCall.gbconnect(isbn);
		bookrepository.save(book);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	@Override
	public Book findbook(int bookId) {
	return	bookrepository.findById(bookId).get();
	}


}
