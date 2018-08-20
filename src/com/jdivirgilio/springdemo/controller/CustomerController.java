package com.jdivirgilio.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdivirgilio.springdemo.dao.CustomerDAO;
import com.jdivirgilio.springdemo.entity.Customer;
import com.jdivirgilio.springdemo.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// Now we need to inject our DAO into controller class
	// Spring will look for CustomerDAO and inject the value here
	// Since we've added the service we need to inject the Service now
	//@Autowired
	//private CustomerDAO customerDAO;
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/list")
	public String listCustomers(Model model) {
		
		// get customer from the DAO
		List<Customer> customers = customerService.getCustomers();
		
		// add the customers to the model
		model.addAttribute("customers", customers);
		
		return "list-customers";
	}
		
}
