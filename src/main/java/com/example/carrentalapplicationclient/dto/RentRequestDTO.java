package com.example.carrentalapplicationclient.dto;

import org.springframework.validation.annotation.Validated;

@Validated
public class RentRequestDTO {

    private Long reservationId;

    private CreditCardDTO creditCard;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public CreditCardDTO getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCardDTO creditCard) {
        this.creditCard = creditCard;
    }
}
