package com.example.carrentalapplicationclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerHistoriesDTO {
    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    private CustomerDTO customer;

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

    @Override
    public String toString() {
        return "CustomerHistoriesDTO{" +
                "customer=" + customer +
                ", reservations=" + reservations +
                ", rents=" + rents +
                '}';
    }
}
