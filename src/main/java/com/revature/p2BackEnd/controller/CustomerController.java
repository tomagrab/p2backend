package com.revature.p2BackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2BackEnd.model.Customer;
import com.revature.p2BackEnd.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping("/customers")
	public List<Customer> findAll() {
		return customerService.findAll();
	}

	@GetMapping("/customersByEmail/{email}")
	public List<Customer> findByEmail(@PathVariable String email) {
		return customerService.findByEmail(email);
	}

	@GetMapping("/customersByMobile/{mobile}")
	public List<Customer> findByMobile(@PathVariable long mobile) {
		return customerService.findByMobile(mobile);
	}

	@GetMapping("/customers/{id}")
	public Customer findById(@PathVariable int id) {
		return customerService.findById(id);
	}

	@PostMapping("/customers")
	public void save(Customer customer) {
		customerService.save(customer);

	}

	@PostMapping("/customers/bulk")
	public void save(Customer[] customers) {
		for (Customer customer : customers) {
			customerService.save(customer);
		}
	}

	@PutMapping("/customers/{id}")
	public void update(int id, Customer customer) {
		customerService.save(customer);

	}

	@DeleteMapping("/customers/{id}")
	public void delete(int id) {
		customerService.delete(id);

	}
}

