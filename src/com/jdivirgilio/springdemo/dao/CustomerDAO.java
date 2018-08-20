package com.jdivirgilio.springdemo.dao;

import java.util.List;

import com.jdivirgilio.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer queryCustomer(int customerId);

	public void deleteCustomer(Customer customer);
}
