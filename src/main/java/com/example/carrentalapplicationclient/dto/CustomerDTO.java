package com.example.carrentalapplicationclient.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.validation.annotation.Validated;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Validated
public class CustomerDTO {


    private Long id;



    private String customerNumber;
    private String name;


    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", customerNumber='" + customerNumber + '\'' + ", name='" + name + '\'' + ", email='" + email + '\'' + '}';
    }

}
