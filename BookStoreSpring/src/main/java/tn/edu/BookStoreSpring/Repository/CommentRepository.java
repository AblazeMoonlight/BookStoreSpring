package tn.edu.BookStoreSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.edu.BookStoreSpring.DOA.Comment;

public interface CommentRepository extends CrudRepository<Comment,Integer> {
}
