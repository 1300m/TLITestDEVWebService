package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository repository;

	@Override
	public List<Customer> getCustomers() {
		return repository.getCustomers();
	}

	@Override
	public Customer getCustomer(String insureName) {
		return repository.getCustomer(insureName);
	}

}
