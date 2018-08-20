package com.jdivirgilio.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdivirgilio.springdemo.dao.CustomerDAO;
import com.jdivirgilio.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// Need to inject the customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {

		// Delegate to the DAO
		return customerDAO.getCustomers(); 
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		
		customerDAO.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer queryCustomer(int customerId) {

		return customerDAO.queryCustomer(customerId);
		
	}

	@Override
	@Transactional
	public void deleteCustomer(Customer customer) {
		customerDAO.deleteCustomer(customer);
	}

}
