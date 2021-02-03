package tn.edu.BookStoreSpring;


import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.edu.BookStoreSpring.DOA.Book;
import tn.edu.BookStoreSpring.DOA.UserFavoriteBooks;
import tn.edu.BookStoreSpring.Repository.UserRepository;
import tn.edu.BookStoreSpring.Service.BookApiCall;
import tn.edu.BookStoreSpring.Service.BookService;
import tn.edu.BookStoreSpring.Service.UserFavoriteBookService;
import tn.edu.BookStoreSpring.Service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class BookStoreSpringApplicationTests {
	@Autowired
	BookService bookservice;
	@Autowired
	UserFavoriteBookService ufb;
	@Autowired
	UserService us;
	@Autowired
	UserRepository ur;
	
	@Test
	public void testfav()
	{
	
	
			bookservice.addBookWithApi("1501143816");
	
			
		}
	
	
}
