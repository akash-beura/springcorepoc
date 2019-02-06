package com.mindtree.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mindtree.entity.Customer;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository{

	public List<Customer> findAll() {
		
		List<Customer> customer = Arrays.asList(new Customer("Akash", "9938213317"));
		return customer;
		
	}

}
