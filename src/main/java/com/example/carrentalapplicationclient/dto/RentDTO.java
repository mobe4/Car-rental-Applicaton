package com.example.carrentalapplicationclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RentDTO {



    private Long id;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    private Long reservationId;



    private Date rentedAt;
    private Date returnedAt;
    private PaymentDTO payment;



    private ReservationDTO reservation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }

    public ReservationDTO getReservation() {
        return reservation;
    }

    public void setReservation(ReservationDTO reservation) {
        this.reservation = reservation;
    }


    public Date getRentedAt() {
        return rentedAt;
    }

    public void setRentedAt(Date rentedAt) {
        this.rentedAt = rentedAt;
    }

    public Date getReturnedAt() {
        return returnedAt;
    }

    @Override
    public String toString() {
        return "RentDTO{" +
                "id=" + id +
                ", reservationId=" + reservationId +
                ", rentedAt=" + rentedAt +
                ", returnedAt=" + returnedAt +
                ", payment=" + payment +
                ", reservation=" + reservation +
                '}';
    }

    public void setReturnedAt(Date returnedAt) {
        this.returnedAt = returnedAt;
    }
}
