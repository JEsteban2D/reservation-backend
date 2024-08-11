package com.coffe.reservation_coffe.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffe.reservation_coffe.entities.Reservation;
import com.coffe.reservation_coffe.entities.RestaurantUser;
import com.coffe.reservation_coffe.repository.ReservationRepository;
import com.coffe.reservation_coffe.repository.UserRepository;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public List<Reservation> getReservationsByUserId(Long userId) {
        RestaurantUser user = userRepository.findById(userId).orElse(null);
        return user != null ? new ArrayList<>(user.getReservations()) : null;
    }
}
