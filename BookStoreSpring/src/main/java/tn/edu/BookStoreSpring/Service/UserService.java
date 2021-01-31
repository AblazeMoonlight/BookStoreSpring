package tn.edu.BookStoreSpring.Service;

import tn.edu.BookStoreSpring.DOA.User;

import java.util.List;

public interface UserService {

    boolean addUser(User c);
    List<User> retrieveAllUsers();
    void deleteUser(User u);
    void deleteUser(Long userId);
    User updateUser(User u);
    User retrieveUser(Long id);
    User loadByEmail(String email);

}
