package com.coffe.reservation_coffe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffe.reservation_coffe.entities.RestaurantUser;

@Repository
public interface UserRepository extends JpaRepository<RestaurantUser, Long> {

}
