package br.com.alex.apit.teste.apifit.controller;


import br.com.alex.apit.teste.apifit.entities.Customer;
import br.com.alex.apit.teste.apifit.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {


    @Autowired
    CustomerService service;

    @GetMapping("/api/customers")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        List<Customer> customers = service.getAllCustomer();
        return ResponseEntity.ok().body(customers);
    }
}
