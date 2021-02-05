package tn.edu.BookStoreSpring.Service;

import java.util.List;
import java.util.Optional;

import tn.edu.BookStoreSpring.DOA.Book;
import tn.edu.BookStoreSpring.DOA.Cart;

public interface CartService {
    List<Cart> getAllComand();
    Optional<Cart> getById(int idUser);
    void addToCart(Integer b1,Integer IdUser,Integer idCart);
    void rmoveFromCart(Book b,Integer IdUser);
    void buyAll();
    void buyOne(int idBook);
    List<Book> rechercheOrder();
}
