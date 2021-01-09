package tn.edu.BookStoreSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.edu.BookStoreSpring.Repository.CartRepository;

@Service
public class CartServiceImp implements CartService{
    @Autowired
    CartRepository cartRepository;
}
