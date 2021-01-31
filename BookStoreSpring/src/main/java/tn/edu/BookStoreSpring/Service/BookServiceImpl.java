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
	public List<Book> retrieveStockBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> retrieveTopBooks() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void bookSugg() {
		List<Book> bookts = new ArrayList<Book>();
		Book b = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		Book b4 = new Book();
		Book b5 = new Book();
		Book b6 = new Book();
		Book b7 = new Book();
		Book b8 = new Book();
		b.setCategory("Horror");
		b.setTitle("djeja");
		bookts.add(b);
		
		b2.setCategory("Horror");
		b2.setTitle("lax");

		bookrepository.save(b);
		bookts.add(b2);
		bookrepository.save(b2);
		b3.setCategory("Comedy");
		bookts.add(b3);
		bookrepository.save(b3);
		b4.setCategory("Action");
		bookts.add(b4);
		bookrepository.save(b4);
		b5.setCategory("Horror");
		b5.setTitle("lax");

		bookts.add(b6);
		bookrepository.save(b5);
		b6.setCategory("Action");
		bookts.add(b7);
		bookrepository.save(b6);
		b7.setCategory("Horror");
		bookrepository.save(b7);

		Map<String,Long> result =bookts.stream()
				.collect(Collectors.groupingBy(Book::getCategory,Collectors.counting()));
		Map<String, Long> finalMap = new LinkedHashMap<>();
		 result.entrySet().stream()
         .sorted(Map.Entry.<String, Long>comparingByValue()
                 .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		 String topcategory=finalMap.entrySet().iterator().next().getKey();
		 bookrepository.findBookBySuggCategory(topcategory).getTitle().toString();
		 System.out.println( bookrepository.findBookBySuggCategory(topcategory).getTitle().toString());
	
		
	}
}
