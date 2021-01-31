package tn.edu.BookStoreSpring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.edu.BookStoreSpring.DOA.User;
import tn.edu.BookStoreSpring.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/testUser")
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/create")
    public @ResponseBody
    String ajouter(@RequestBody  User u) {

        userService.addUser(u) ;
        return u.toString();

    }
    @GetMapping("/retrieve-all-users")
    @ResponseBody
    public List<User> getUsers() {
        List<User> list = userService.retrieveAllUsers();
        return list;
    }

    @GetMapping("/retrieve-user/{id_user}")
    @ResponseBody
    public User retrieveUser(@PathVariable("id_user") Long userId) {
        return userService.retrieveUser(userId);
    }

    @DeleteMapping("/remove-user/{id_user}")
    @ResponseBody
    public void removeUser(@PathVariable("id_user") Long userId) {
        userService.deleteUser(userId);
    }


    @PutMapping("/modify-user/{id_user}")
    @ResponseBody
    public User modifyUser(@RequestBody User user,@PathVariable("id_user") Long userId) {
        return userService.updateUser(user);
    }


}
