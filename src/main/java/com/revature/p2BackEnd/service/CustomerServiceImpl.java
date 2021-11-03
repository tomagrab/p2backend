package com.revature.p2BackEnd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p2BackEnd.model.Customer;
import com.revature.p2BackEnd.repo.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public List<Customer> findByEmail(String email) {
		return customerRepository.findByEmail(email);
	}

	@Override
	public List<Customer> findByMobile(long mobile) {
		return customerRepository.findByMobile(mobile);
	}

	@Override
	public Customer findById(int id) {
		return customerRepository.findById(id).get();
	}

	@Override
	public void save(Customer customer) {
		customerRepository.save(customer);

	}

	@Override
	public void update(int id, Customer customer) {
		customerRepository.save(customer);

	}

	@Override
	public void delete(int id) {
		customerRepository.deleteById(id);

	}

}
