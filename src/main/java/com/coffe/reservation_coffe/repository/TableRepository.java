package com.coffe.reservation_coffe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffe.reservation_coffe.entities.RestaurantTable;

public interface TableRepository extends JpaRepository<RestaurantTable, Long> {

}
