package com.mindtree.driver;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindtree.entity.Customer;
import com.mindtree.service.CustomerService;

public class AppDriver {
	
	
	public static void main(String[] args) {
		
//		CustomerService customerService = new CustomerServiceImpl();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService customerService = ctx.getBean("customerService", CustomerService.class);
		
		List<Customer> customers = customerService.findAll();
		customers.forEach(c -> System.out.println(c.getCustomerName()));
		
		
	}

}
