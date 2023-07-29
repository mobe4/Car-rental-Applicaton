package com.example.carrentalapplicationclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomersDTO {
    private List<CustomerDTO> customers = new ArrayList<>();

    public List<CustomerDTO> getCustomers() {
        return customers;
    }

    @Override
    public String toString() {
        return "CustomersDTO{" +
                "customers=" + customers +
                '}';
    }

    public void setCustomers(List<CustomerDTO> customers) {
        this.customers = customers;
    }
}
