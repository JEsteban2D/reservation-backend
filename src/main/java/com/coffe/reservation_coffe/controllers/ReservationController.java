package com.coffe.reservation_coffe.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coffe.reservation_coffe.dto.ReservationDTO;
import com.coffe.reservation_coffe.entities.Reservation;
import com.coffe.reservation_coffe.entities.RestaurantUser;
import com.coffe.reservation_coffe.services.ReservationService;
import com.coffe.reservation_coffe.services.UserService;


@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping
    public Reservation createReservation(@RequestBody ReservationDTO reservationDTO) {
        Long userId = reservationDTO.getUserId();
        RestaurantUser user = userService.getUserById(userId);
        
        Reservation reservation = new Reservation();
        reservation.setReservationTime(reservationDTO.getReservationTime());
        reservation.setUser(user);

        return reservationService.saveReservation(reservation);
    }

    @GetMapping("/user/{userId}")
    public List<Reservation> getReservationsByUserId(@PathVariable Long userId) {
        return reservationService.getReservationsByUserId(userId);
    }

    // @DeleteMapping("/{id}")
    // public void deleteReservation(@PathVariable Long id) {
    //     reservationService.deleteReservation(id);
    // }
}
