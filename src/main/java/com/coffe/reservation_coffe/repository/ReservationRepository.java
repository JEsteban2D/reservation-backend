package com.coffe.reservation_coffe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffe.reservation_coffe.entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
