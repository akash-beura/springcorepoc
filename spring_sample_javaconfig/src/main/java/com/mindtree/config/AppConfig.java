package com.mindtree.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mindtree.repository.CustomerRepository;
import com.mindtree.repository.CustomerRepositoryImpl;
import com.mindtree.service.CustomerService;
import com.mindtree.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.mindtree"})
public class AppConfig {
	
//	@Bean(name="customerRepository")
//	public CustomerRepository getCustomerRepository()
//	{
//		return new CustomerRepositoryImpl();
//	}
//	
//	@Bean(name="customerService")
//	public CustomerService getCustomerService()
//	{
		//Used for setter injection
		/*
			CustomerServiceImpl customerService = new CustomerServiceImpl();
			customerService.setCustomerRepository(getCustomerRepository());
			return customerService;
		*/
		
		
		//Used for Constructor Injection
//		CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());
//		return customerService;
//		
//	}

}
