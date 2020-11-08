package com.alten.vmc.repo;

import com.alten.vmc.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {
    public Vehicle findByRegistrationNumber(String registrationNumber);
    public List<Vehicle> findByName(String name);
    public Vehicle findByPlateNumber(String plateNumber);
    public Vehicle findByStatus(String status);

}