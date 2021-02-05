package tn.edu.BookStoreSpring.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import tn.edu.BookStoreSpring.DOA.User;
import tn.edu.BookStoreSpring.Repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service("userService")
@Transactional()
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userrep;
    private static final Logger l = LogManager.getLogger(UserServiceImp.class);
    public List<User> retrieveAllUsers() {

        List<User> users =(List<User>) userrep.findAll();
        for(User user:users)
        {
            l.info("User+++ :" + user);
        }
        return users;
    }

    public boolean addUser(User u) {
        return userrep.save(u) != null;

    }

    public void deleteUser(User u) {

        userrep.delete(u);
    }
    @Modifying
    public User updateUser(User u) {


        return   userrep.save(u);
    }


    public User retrieveUser(Long id) {
        User u=userrep.findById(id).get();
        l.info("User+++ :" + u);
        return  u;

    }

    public void deleteUser(Long userId) {
        userrep.deleteById(userId);

    }

    @Override
    public User loadByEmail(String email) {
      return userrep.findByEmail(email);
}
}