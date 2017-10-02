package com.he.controller;

import com.he.entity.User;
import com.he.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;


    @PostMapping("/users")
    public void saveUser(@RequestBody User user) {
        user.setName("张三").setAge(21);
        userRepository.save(user);
    }

    @PutMapping("/user/{id}")
    public void updateUser(@RequestBody User user, @PathVariable Long id) {
        user.setName("gali");
        userRepository.save(user);
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepository.getOne(id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.delete(id);
    }

}
