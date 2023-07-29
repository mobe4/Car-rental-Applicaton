package com.example.carrentalapplicationclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarHistoriesDTO {


    List<ReservationDTO> reservations;
    List<RentDTO> rents;



    public List<ReservationDTO> getReservations() {
        return reservations;
    }


    public void setReservations(List<ReservationDTO> reservations) {
        this.reservations = reservations;
    }

    public List<RentDTO> getRents() {
        return rents;
    }

    public void setRents(List<RentDTO> rents) {
        this.rents = rents;
    }
}
