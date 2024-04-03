package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Customer;

@Repository
public class CustomerRepository {
	private List<Customer> customers;
	
	public CustomerRepository() {
		customers = new ArrayList<>();
		customers.add(new Customer("นายA1", "P00031", "CL", "A", "00000005"));
	}
	
	public List<Customer> getCustomers() {
		return customers;
	}
	
	public Customer getCustomer(String insureName) {
		for(Customer customer : customers) {
			if(customer.getInsureName().startsWith(insureName)) {
				return customer;
			}
		}
		return null;
	}
}
