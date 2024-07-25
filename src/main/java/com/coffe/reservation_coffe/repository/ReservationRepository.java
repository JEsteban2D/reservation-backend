package com.coffe.reservation_coffe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffe.reservation_coffe.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
