package com.mindtree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.entity.Customer;
import com.mindtree.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	
	//Field or member injection
	@Autowired
	CustomerRepository customerRepository;
	
//If we use @Autowired here, It will be constructor injection
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}


	public CustomerServiceImpl() {}
	
//	If we use @Autowired here, It will be setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}





	public List<Customer> findAll()
	{
		
		return customerRepository.findAll();
		
	}

	
}
