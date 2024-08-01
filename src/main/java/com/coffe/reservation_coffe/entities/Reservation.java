package com.coffe.reservation_coffe.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime reservationTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference
    private RestaurantUser restaurantUser;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public RestaurantUser getUser() {
        return restaurantUser;
    }
    public void setUser(RestaurantUser restaurantUser) {
        this.restaurantUser = restaurantUser;
    }
    public LocalDateTime getReservationTime() {
        return reservationTime;
    }
    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }
    

}

