package br.com.alex.apit.teste.apifit.service;

import br.com.alex.apit.teste.apifit.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {

    public List<Customer> getAllCustomer() {
        List<Customer> CUSTOMERS = List.of(
                new Customer(1L, "john", "doe", "john@javawhizz.com"),
                new Customer(2L, "mary", "public", "mary@javawhizz.com"),
                new Customer(3L, "elon", "musk", "elon@javawhizz.com"),
                new Customer(4L, "dunny", "duncan", "dunny@javawhizz.com")
        );

        return CUSTOMERS;
    }
}
