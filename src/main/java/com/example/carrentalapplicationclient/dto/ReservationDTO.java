package com.example.carrentalapplicationclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReservationDTO {

    private Long id;


    private CustomerDTO customer;

    private Date createdAt;
    private Date cancelledAt;

    public Date getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(Date cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    private int period;

    private String carId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "id=" + id +
                ", customer=" + customer +
                ", createdAt=" + createdAt +
                ", cancelledAt=" + cancelledAt +
                ", period=" + period +
                ", carId='" + carId + '\'' +
                '}';
    }
}
