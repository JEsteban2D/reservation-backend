package com.coffe.reservation_coffe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coffe.reservation_coffe.entities.RestaurantUser;
import com.coffe.reservation_coffe.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<RestaurantUser> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public RestaurantUser getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public RestaurantUser createUser(@RequestBody RestaurantUser user) {
        return userService.saveUser(user);
    }

    @PutMapping("/{id}")
    public RestaurantUser updateUser(@PathVariable Long id, @RequestBody RestaurantUser user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

}
