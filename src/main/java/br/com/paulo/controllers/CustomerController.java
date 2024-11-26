package br.com.paulo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.paulo.models.Customer;
import br.com.paulo.services.CustomerServices;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	private CustomerServices service;
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value = "/{id}",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Customer findById(@PathVariable (value = "id") Long id) throws Exception{
		
		return service.findById(id);
	}
}
