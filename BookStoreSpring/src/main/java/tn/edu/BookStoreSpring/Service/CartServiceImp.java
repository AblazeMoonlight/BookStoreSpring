package tn.edu.BookStoreSpring.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.edu.BookStoreSpring.DOA.Book;
import tn.edu.BookStoreSpring.DOA.Cart;
import tn.edu.BookStoreSpring.Repository.BookRepository;
import tn.edu.BookStoreSpring.Repository.CartRepository;

@Service
public class CartServiceImp implements CartService{
	@Autowired
    CartRepository cartRepository;

    @Autowired
    BookRepository bookRepository;



    @Override
    public List<Cart> getAllComand() {

        List<Cart> books =(List<Cart>) cartRepository.findAll();
        for(Cart book:books)
        {
           
        }
        return books;
    }

    @Override
    public Optional<Cart> getById(int idUser) {
        return cartRepository.findById(idUser);
    }

    @Override
    public void addToCart(Integer b1,Integer IdUser,Integer idCart) {

        Cart cc = new Cart();

        List<Cart> c=(List<Cart>) cartRepository.findAll();
        for (Cart cs:c)
        {
            if (cs.getIdCart()==idCart)
                cc=cs;
        }

        List<Book> books =(List<Book>) bookRepository.findAll();
        for(Book book:books)
        {
            if (book.getIdBook()==b1)
            {
                cc.getBooks().add(book);
            }
        }

        cartRepository.save(cc);
    }


    public void rmoveFromCart(Book b,Integer IdUser) {
//        Cart n= (Cart) cartRepository.findCurrentCart(IdUser);
//        n.getBooks().remove(b);
//        cartRepository.save(n);
    }

    @Override
    public void buyAll() {

    }

    @Override
    public void buyOne(int idBook) {

    }

    @Override
    public List<Book> rechercheOrder() {
        return null;
    }
}
