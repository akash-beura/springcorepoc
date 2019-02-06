package com.mindtree.entity;

public class Customer {
	
	private String customerName;
	private String customerNumber;
	
	public Customer() {}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public Customer(String customerName, String customerNumber) {
		super();
		this.customerName = customerName;
		this.customerNumber = customerNumber;
	}

}
