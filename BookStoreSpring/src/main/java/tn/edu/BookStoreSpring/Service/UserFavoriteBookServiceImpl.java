package tn.edu.BookStoreSpring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.edu.BookStoreSpring.DOA.Book;
import tn.edu.BookStoreSpring.Repository.UserFavoriteBooksRepository;

public class UserFavoriteBookServiceImpl implements UserFavoriteBookService {
	@Autowired
	UserFavoriteBooksRepository uf;
	@Override
	public List<Book> retrieveUserFavoriteBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBookToFavorite(Book b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveFromFavorites(Book b) {
		// TODO Auto-generated method stub
		
	}

}
