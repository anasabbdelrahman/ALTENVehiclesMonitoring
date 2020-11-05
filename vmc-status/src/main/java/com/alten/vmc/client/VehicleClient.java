package com.alten.vmc.client;

import com.alten.vmc.model.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="vmc-vehicle" ,url="http://localhost:8080")
public interface VehicleClient {
    @GetMapping("/vmc/vehicle")
    List<Vehicle> findAll();

    @GetMapping("/vmc/vehicle/{id}")
    Vehicle getVehicle(@PathVariable("id")String id);
}
