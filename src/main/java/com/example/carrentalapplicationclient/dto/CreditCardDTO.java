package com.example.carrentalapplicationclient.dto;


import org.springframework.validation.annotation.Validated;



@Validated
public class CreditCardDTO {


    private String number;
    private String cvv;
    private String expirationDate;

    public CreditCardDTO() {
    }

    public CreditCardDTO(String number, String cvv, String expirationDate) {
        this.number = number;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


}
