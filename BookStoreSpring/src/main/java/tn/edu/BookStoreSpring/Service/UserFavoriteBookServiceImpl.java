package tn.edu.BookStoreSpring.Service;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.edu.BookStoreSpring.DOA.Book;
import tn.edu.BookStoreSpring.DOA.User;
import tn.edu.BookStoreSpring.DOA.UserFavoriteBooks;
import tn.edu.BookStoreSpring.Repository.BookRepository;
import tn.edu.BookStoreSpring.Repository.UserFavoriteBooksRepository;
import tn.edu.BookStoreSpring.Repository.UserRepository;


@Service
public class UserFavoriteBookServiceImpl implements UserFavoriteBookService {
	@Autowired
	UserFavoriteBooksRepository ufb;
	@Autowired
	UserRepository ur;
	@Autowired
	BookRepository bookrepository;
	@Autowired
	SendMail sm;
	@Autowired
	UserService userservice;
	
	@Override
	public List<Book> retrieveUserFavoriteBooks(int userId) {
		User u = ur.findById(userId).get();
		List<UserFavoriteBooks> userfavs=u.getUfb();
		
				List<Book> books =userfavs.stream().map(UserFavoriteBooks::getBooks).collect(Collectors.toList());
	
		return books;
	}

	@Override
	public void addBookToFavorite(Book b,int userId) {
		User user =ur.findById(userId).get();
		System.out.println(user.getIdUser());
		List<UserFavoriteBooks> favorites=  user.getUfb();
		user.setUfb(favorites);
		UserFavoriteBooks favorite = new UserFavoriteBooks();
		favorite.setBooks(b);
		favorite.setUser(user);
		favorites.add(favorite);
		
		
		
		
		
		ufb.saveAll(favorites);
		user.setUfb(favorites);
		ur.save(user);
		
		
	}

	
	@Override
	public String bookSugg(int userId) {
		User u = ur.findById(userId).get();
		List<UserFavoriteBooks> userfavs=u.getUfb();
		
				List<Book> bookts =userfavs.stream().map(UserFavoriteBooks::getBooks).collect(Collectors.toList());
		

		Map<String,Long> result =bookts.stream()
				.collect(Collectors.groupingBy(Book::getCategory,Collectors.counting()));
		Map<String, Long> finalMap = new LinkedHashMap<>();
		 result.entrySet().stream()
         .sorted(Map.Entry.<String, Long>comparingByValue()
                 .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		 String topcategory=finalMap.entrySet().iterator().next().getKey();
		 bookrepository.findBookBySuggCategory(topcategory).getTitle().toString();
		 System.out.println( bookrepository.findBookBySuggCategory(topcategory).getTitle().toString());
        String booksugg= bookrepository.findBookBySuggCategory(topcategory).getTitle();
			sm.sendEmail("elyes.jarroudi@esprit.tn","Book Suggestion","Depending on your favorite books we thought you might like this one "+    bookrepository.findBookBySuggCategory(topcategory));
			return booksugg;
	
		
	}

	@Override
	public void RemoveFromFavorites(Book b, int userId) {
		// TODO Auto-generated method stub
		
	}
}
