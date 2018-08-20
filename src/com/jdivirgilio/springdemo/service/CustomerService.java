package com.jdivirgilio.springdemo.service;

import java.util.List;

import com.jdivirgilio.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer queryCustomer(int customerId);

	public void deleteCustomer(Customer customer);

	public List<Customer> searchCustomers(String customerName);

}
