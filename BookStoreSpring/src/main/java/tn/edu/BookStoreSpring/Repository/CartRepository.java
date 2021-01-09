package tn.edu.BookStoreSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.edu.BookStoreSpring.DOA.Cart;

public interface CartRepository extends CrudRepository<Cart,Integer> {
}
