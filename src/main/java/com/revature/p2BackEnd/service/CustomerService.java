package com.revature.p2BackEnd.service;

import java.util.List;

import com.revature.p2BackEnd.model.Customer;

public interface CustomerService {
	public List<Customer> findAll();
	
	public List<Customer> findByEmail(String email);
	
	public List<Customer> findByMobile( long mobile);
	
	

	public Customer findById(int id);

	public void save(Customer customer);

	public void update(int id, Customer customer);

	public void delete(int id);
}
