package com.coffe.reservation_coffe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffe.reservation_coffe.entities.RestaurantUser;

public interface UserRepository extends JpaRepository<RestaurantUser, Long> {
    RestaurantUser findByUsername(String username);
}
