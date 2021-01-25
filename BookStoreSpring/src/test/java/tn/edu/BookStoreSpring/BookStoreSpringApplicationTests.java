package tn.edu.BookStoreSpring;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.edu.BookStoreSpring.DOA.Book;
import tn.edu.BookStoreSpring.Service.BookService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookStoreSpringApplicationTests {
	@Autowired
	BookService bookservice;
	
	@Test
	public void testbookSugg()
	{
		bookservice.bookSugg();
	
	}

	
}
