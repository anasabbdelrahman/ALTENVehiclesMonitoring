package com.alten.vmc.repository;

import com.alten.vmc.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository <Customer,String> {
}
