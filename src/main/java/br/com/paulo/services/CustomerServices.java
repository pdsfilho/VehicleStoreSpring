package br.com.paulo.services;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.paulo.models.Customer;

@Service
public class CustomerServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	private Logger logger = Logger.getLogger(CustomerServices.class.getName());
	
	public Customer findById(Long id) {
		
		Customer customer = new Customer();
		
		customer.setId(counter.incrementAndGet());
		customer.setName("Name1");
		customer.setCpf("025745888");
		customer.setTelNumber("33262117");
		customer.getAddress().setZip("54054111");
		customer.getAddress().setStreet("Rua aleatória");
		customer.getAddress().setNumber(123);
		
		return customer;
	}
}
