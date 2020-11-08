package com.alten.vmc.client;


import com.alten.vmc.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@FeignClient(name="vmc-vehicle" ,url="http://localhost:8080")
public interface VehicleClient {

    @GetMapping("/vmc/vehicle")
    List<Vehicle> findAll();

    @PostMapping("/vmc/vehicle/{id}")
    Optional<Vehicle> pulse(@PathVariable("id") String id);
}
