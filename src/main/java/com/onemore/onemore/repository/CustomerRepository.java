package com.onemore.onemore.repository;

import java.util.List;


import com.onemore.onemore.model.customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface CustomerRepository extends ElasticsearchRepository<customer, String> {

    List<customer> findByFirstname(String firstName);
}