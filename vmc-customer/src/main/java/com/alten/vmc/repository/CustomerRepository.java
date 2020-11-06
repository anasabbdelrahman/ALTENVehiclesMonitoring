package com.alten.vmc.repository;

import com.alten.vmc.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository <Customer,String> {
}
