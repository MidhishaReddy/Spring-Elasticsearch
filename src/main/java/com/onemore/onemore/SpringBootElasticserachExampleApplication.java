package com.onemore.onemore;

import java.util.List;

import com.onemore.onemore.model.customer;
import com.onemore.onemore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootElasticserachExampleApplication {

	@Autowired
	private CustomerRepository repository;

	@PostMapping("/saveCustomer")
	public int saveCustomer(@RequestBody List<customer> customers) {
		repository.saveAll(customers);
		return customers.size();
	}

	@GetMapping("/findAll")
	public Iterable<customer> findAllCustomers() {
		return repository.findAll();
	}

	@GetMapping("/findByFName/{firstName}")
	public List<customer> findByFirstName(@PathVariable String firstName) {
		return repository.findByFirstname(firstName);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElasticserachExampleApplication.class, args);
	}
}
