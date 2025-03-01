package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.repositories.CustomerRepositories;

@Service
public class CustomerService {
	
			@Autowired
			CustomerRepositories crepo;
			
			public Customer onBoard(Customer customer) {
				return crepo.save(customer);
			}
			
			public Customer getbyId(int id) {
				Customer customer =  crepo.findById(id).get();
				return customer;
			}
			
			public List<Customer> getAll() {
				return crepo.findAll();
			}
			
			public Customer updateDetails(int id, Customer customer) {
				Customer cust = crepo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
				cust.setName(customer.getName());
			    cust.setEmail(customer.getEmail());
			    cust.setPhone(customer.getPhone());
			    cust.setAddress(customer.getAddress());
			    cust.setRoomid(customer.getRoomid());
			    cust.setPayment(customer.getPayment());
			    return crepo.save(cust);
			}
			
			public String deleteDetails(int id) {
				crepo.deleteById(id);
				return "Customer Deleted Successfully";
			}

}
