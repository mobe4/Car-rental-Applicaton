package com.example.carrentalapplicationclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CarsDTO {


    private List<CarDTO> cars;

    public List<CarDTO> getCars() {
        return cars;
    }

    public void setCars(List<CarDTO> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "CarsDTO{" +
                "cars=" + cars +
                '}';
    }
}
