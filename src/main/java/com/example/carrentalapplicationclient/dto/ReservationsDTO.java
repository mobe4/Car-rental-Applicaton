package com.example.carrentalapplicationclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationsDTO {
    public List<ReservationDTO> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDTO> reservations) {
        this.reservations = reservations;
    }

    private List<ReservationDTO> reservations = new ArrayList<>();

    @Override
    public String toString() {
        return "ReservationsDTO{" +
                "reservations=" + reservations +
                '}';
    }
}
