package thareesha.career.CareerProject.controller;

import thareesha.career.CareerProject.models.*;
import thareesha.career.CareerProject.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userservice;

    @GetMapping
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userservice.getUser(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userservice.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        return userservice.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userservice.deleteUser(id);
    }
}