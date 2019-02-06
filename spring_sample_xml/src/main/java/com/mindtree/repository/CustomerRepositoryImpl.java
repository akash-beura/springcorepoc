package com.mindtree.repository;

import java.util.Arrays;
import java.util.List;

import com.mindtree.entity.Customer;

public class CustomerRepositoryImpl implements CustomerRepository{

	public List<Customer> findAll() {
		
		List<Customer> customer = Arrays.asList(new Customer("Akash", "9938213317"));
		return customer;
		
	}

}
