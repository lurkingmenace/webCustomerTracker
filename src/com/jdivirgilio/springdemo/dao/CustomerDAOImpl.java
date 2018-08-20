package com.jdivirgilio.springdemo.dao;

import java.util.List;

import javax.persistence.OrderBy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jdivirgilio.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// Need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	// Removed @Transcational. It's been moved to the @Service CustomerServiceImpl (Service layer)
	public List<Customer> getCustomers() {
		
		// Get the current hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		// Create a query
		Query<Customer> query = session.createQuery("from Customer order by lastName", Customer.class);
		
		// execute query and get result list
		List<Customer> customers = query.getResultList();
		
		// return the results
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {

		// Get the currrent hibernate session
		Session session = sessionFactory.getCurrentSession();
		
		// save the customer
		session.save(customer);
		
	}

}
