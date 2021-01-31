package tn.edu.BookStoreSpring;

import java.sql.Date;
import java.time.LocalDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.edu.BookStoreSpring.DOA.User;
import tn.edu.BookStoreSpring.Service.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BookStoreSpringApplicationTests {

	@Autowired
	UserService es;

		@Test
		public void contextLoads() {
		}

		@Test
		public void testAddUser() {
			User user = new User( 1l, "name", "lastname", "person@mail.com", "azert", "12345678" , "client");
			es.addUser(user);
			}
	@Test
	public void testUpdateUser() {
		User user = new User( 1l, "nour", "laabidi", "person@mail.com", "azert", "12345678" , "client");
		es.updateUser(user);}

	@Test
	public void testUser(){
	es.retrieveUser(1l);

	}




}
