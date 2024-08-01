package com.coffe.reservation_coffe.dto;

import java.time.LocalDateTime;

public class ReservationDTO {

    private LocalDateTime reservationTime;
    private Long userId;

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
