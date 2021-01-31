package tn.edu.BookStoreSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.edu.BookStoreSpring.DOA.User;

import java.util.Optional;
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
 /*   User findById(int idUser);

    User findByEmail(String email);

     Integer deleteById(int id);*/
 User findByEmail(String email);


}


