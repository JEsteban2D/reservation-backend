package com.coffe.reservation_coffe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffe.reservation_coffe.entities.RestaurantUser;
import com.coffe.reservation_coffe.repository.UserRepository;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    public List<RestaurantUser> getAllUsers() {
        return userRepository.findAll();
    }

    public RestaurantUser getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public RestaurantUser saveUser(RestaurantUser user) {
        return userRepository.save(user);
    }

    public RestaurantUser updateUser(Long id, RestaurantUser user) {
        if (userRepository.existsById(id)) {
            user.setId(id);
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
