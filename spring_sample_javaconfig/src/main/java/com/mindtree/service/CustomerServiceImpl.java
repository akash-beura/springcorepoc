package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.entity.Customer;
import com.mindtree.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	

	@Autowired
	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImpl() {}
	
	//Used for constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	
	//Can be used for setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	

	public List<Customer> findAll()
	{
		
		return customerRepository.findAll();
		
	}

	
}
