package com.example.carrentalapplicationclient.dto;


import org.springframework.validation.annotation.Validated;

public class CreateReservationRequestDTO {




    private Long customerId;


    private Integer period;


    private String carType;
    private String carBrand;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "CreateReservationRequestDTO{" + "customerId=" + customerId + ", period=" + period + ", carType='" + carType + '\'' + ", carBrand='" + carBrand + '\'' + '}';
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
