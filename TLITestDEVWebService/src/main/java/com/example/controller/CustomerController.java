package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return service.getCustomers();
	}
	
	@GetMapping("/customers/{name}")
	public Customer getUserID(@PathVariable("name") String insureName) {
		return service.getCustomer(insureName);
	}
}
