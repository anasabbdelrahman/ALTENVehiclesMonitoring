package com.alten.vmc.service;

import com.alten.vmc.model.CustomerModel;
import com.alten.vmc.repository.CustomerRepository;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<CustomerModel> findAll() {
        return customerRepository.findAll();
    }

    public CustomerModel findById (String id) {
        if(StringUtils.isEmpty(id))
            throw new IllegalArgumentException("Null or missing ID!");
        return customerRepository.findById(id).orElse(null);
    }

    public CustomerModel createCustomer (CustomerModel customer) {
        if (customer == null)
            throw new IllegalArgumentException("Missing customer!");
        return customerRepository.save(customer);
    }

    public CustomerModel findDummyCustomer () {
        CustomerModel customer = new CustomerModel();
        List <String> vehiclesNos = new ArrayList<>();

        customer.setId("001");
        customer.setName("Anas Abdel Rahman");
        customer.setAge("32");
        vehiclesNos.add("111");
        vehiclesNos.add("222");
        vehiclesNos.add("333");
        vehiclesNos.add("444");
        customer.setVehicleNos(vehiclesNos);

        return customer;
    }
}
