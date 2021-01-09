package tn.edu.BookStoreSpring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.edu.BookStoreSpring.Repository.CommentRepository;

@Service
public class CommentServiceImp implements CommentService{

    @Autowired
    CommentRepository commentRepository;
}
