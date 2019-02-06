package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Customer;
import com.mindtree.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;	

	public CustomerServiceImpl() {
	}
	
	public List<Customer> findAll()
	{
		return customerRepository.findAll();		
	}


	
	
	
/*------------------This is used for setter injection-----------------------------*/
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
/* Used for constructor Injection */
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}	






	
	
}
