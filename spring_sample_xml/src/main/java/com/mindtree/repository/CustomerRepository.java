package com.mindtree.repository;

import java.util.List;

import com.mindtree.entity.Customer;

public interface CustomerRepository {
	
	public List<Customer> findAll();

}
