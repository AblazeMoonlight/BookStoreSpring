package tn.edu.BookStoreSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.edu.BookStoreSpring.DOA.Book;
import tn.edu.BookStoreSpring.Repository.BookRepository;
import tn.edu.BookStoreSpring.Service.BookService;

@RequestMapping("book")
@RestController
public class BookController {
	
	
	@Autowired
	BookService bookservice;
	@Autowired 
	BookRepository br;
	// 	
	 @GetMapping("retrieveAllBooks")
	 @ResponseBody
	 public  List<Book> getallBooks() {
	 List<Book> list = bookservice.retrieveAllBooks();
	 return list;
	 }
	 @PostMapping("/addbookapi/{isbn}")
	 @ResponseBody
	 public  void addBookApi(@PathVariable("isbn") String isbn) {
		
		 bookservice.addBookWithApi(isbn);
	 }
	
	  @DeleteMapping("/remove-book/{bookId}")
	    @ResponseBody
	   public void removeItem(@PathVariable("bookId") int bookId) {
		Book book=  bookservice.findbook(bookId);
	    	bookservice.deleteUser(book);
	   } @GetMapping("retrieveBook/{bookId}")
		 @ResponseBody
		 public  Book getBook(@PathVariable("bookId") int bookId) {
		Book book = bookservice.retrieveBook(bookId);
		 return book;
		 }
	 
	 }


