package com.alten.vmc.repository;

import com.alten.vmc.model.CustomerModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public class CustomerRepository extends MongoRepository <CustomerModel,String> {
}
