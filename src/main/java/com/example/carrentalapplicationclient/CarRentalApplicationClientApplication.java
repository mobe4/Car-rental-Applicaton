package com.example.carrentalapplicationclient;

import com.example.carrentalapplicationclient.dto.CustomerDTO;
import com.example.carrentalapplicationclient.dto.CustomerHistoriesDTO;
import com.example.carrentalapplicationclient.dto.CustomersDTO;
import com.example.carrentalapplicationclient.dto.ReservationsDTO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CarRentalApplicationClientApplication implements CommandLineRunner {

    RestTemplate restTemplate = new RestTemplate();
    String url = "http://localhost:8080";

    public static void main(String[] args) {
        SpringApplication.run(CarRentalApplicationClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.setCustomerNumber("AaaaaPP88");
        customerDTO.setEmail("mmamsaa@Eamil.coo");
        customerDTO.setName("Brandon");

        CustomerDTO createdCustomer = createCustomer(customerDTO);
        System.out.println("Created customer -------------------------------------");
        System.out.println(createdCustomer);


        CustomersDTO customersDTO = getAllCustomers();
        System.out.println("Customers ---------------------------------------");
        System.out.println(customersDTO);

        deleteCustomer(createdCustomer.getId());


        CustomerDTO customerDTO1 = getCustomerById(3l);
        System.out.println("Customer by id--------------------------------------------");
        System.out.println(customerDTO1);

        ReservationsDTO reservationsDTO = getReservations();

        System.out.println("Reservations - ---------------------------------------------");
        System.out.println(reservationsDTO);

        CustomerHistoriesDTO customerHistoriesDTO = getCustomerHistoryById(3l);

        System.out.println("Customer history by id-----------------------------------------");

        System.out.println(customerHistoriesDTO);


    }

    private void deleteCustomer(Long id) {
        restTemplate.delete(url + "/customers/" + id);

    }

    private CustomerDTO createCustomer(CustomerDTO customerDTO) {
        return restTemplate.postForObject(url + "/customers", customerDTO, CustomerDTO.class);
    }

    private CustomerDTO getCustomerById(Long id) {
        return restTemplate.getForObject(url + "/customers/" + id, CustomerDTO.class);
    }

    private CustomersDTO getAllCustomers() {
        return restTemplate.getForObject(url + "/customers", CustomersDTO.class);
    }

    private ReservationsDTO getReservations() {
        return restTemplate.getForObject(url + "/reservations?page=0&size=100", ReservationsDTO.class);
    }

    private CustomerHistoriesDTO getCustomerHistoryById(Long id) {
        return restTemplate.getForObject(url + "/histories?customer=" + id, CustomerHistoriesDTO.class);

    }
}
