package com.happyfresh.learn.repository;

import com.happyfresh.learn.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, String > {
}
