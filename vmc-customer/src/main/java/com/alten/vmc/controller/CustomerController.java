package com.alten.vmc.controller;

import com.alten.vmc.model.CustomerModel;
import com.alten.vmc.service.CustomerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@EnableSwagger2
@RequestMapping("/fms")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
    public List <CustomerModel> getCustomers() {
        return customerService.findAll();
    }

    @HystrixCommand(fallbackMethod = "getDummyCustomer", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value="60") })
    @GetMapping("/customer/{id}")
    public CustomerModel getCustomer(@PathVariable("id")String id) {
        return customerService.findById(id);
    }
}
