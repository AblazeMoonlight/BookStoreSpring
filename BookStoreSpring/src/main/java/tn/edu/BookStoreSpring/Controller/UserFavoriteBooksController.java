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
import tn.edu.BookStoreSpring.Service.BookService;
import tn.edu.BookStoreSpring.Service.UserFavoriteBookService;

@RequestMapping("favorite")
@RestController
public class UserFavoriteBooksController {
	@Autowired
	UserFavoriteBookService ufb;
	@Autowired
	BookService bookservice;
	 @GetMapping("retrieveUserFavoriteBooks/{userId}")
	 @ResponseBody
	 public  List<Book> getallBooks(@PathVariable("userId") int userId) {
	 List<Book> list = ufb.retrieveUserFavoriteBooks(userId);
	 return list;
	 }
	
	

@PostMapping("/addBookToFavorite/{Bookid}/{userId}")
@ResponseBody
public  void addBookToFavorite(@PathVariable("Bookid") int Bookid,@PathVariable("userId") int userId) {
	
	Book book =bookservice.retrieveBook(Bookid);
	ufb.addBookToFavorite(book,userId);
}
@DeleteMapping("/RemoveFromFavorites/{Bookid}/{userId}")
@ResponseBody
public void removeItem(@PathVariable("bookid") int bookid,@PathVariable("userId") int userId) {
Book book=  bookservice.findbook(bookid);
	ufb.RemoveFromFavorites(book, userId);
} 
@GetMapping("retrievesuggbook/{userId}")
@ResponseBody
public  String getSuggestedBook(@PathVariable("userId") int userId) {
	return  ufb.bookSugg(userId);

}


}
