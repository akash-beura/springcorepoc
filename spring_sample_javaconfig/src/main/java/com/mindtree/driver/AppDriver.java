package com.mindtree.driver;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindtree.config.AppConfig;
import com.mindtree.entity.Customer;
import com.mindtree.service.CustomerService;

public class AppDriver {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = ctx.getBean("customerService", CustomerService.class);
		List<Customer> customers = customerService.findAll();
		customers.forEach(c -> System.out.println(c.getCustomerName()));
		
	}

}
