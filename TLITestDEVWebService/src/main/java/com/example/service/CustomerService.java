package com.example.service;

import java.util.List;

import com.example.model.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();
	public Customer getCustomer(String insureName);
}
