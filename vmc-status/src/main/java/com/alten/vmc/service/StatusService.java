package com.alten.vmc.service;

import com.alten.vmc.model.Vehicle;
import com.alten.vmc.model.VehicleStatus;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    @Autowired
    private VehicleClient vehicleClient;

    public Vehicle findDummyVehicle() {

        Vehicle vehicle = new Vehicle();

        vehicle.setId("123XYZ");
        vehicle.setName("Vehicle Name");
        vehicle.setModel("Vehicle Model");
        vehicle.setPlateNumber("ABC789");
        vehicle.setStatus(VehicleStatus.CONNECTED.getStatusCode);

        return vehicle;
    }

    public Vehicle findStatus(String vehicleId) {
        if (StringUtils.isEmpty(vehicleId)){
            throw new IllegalArgumentException("Null or missing vehicle Id");
        }
            return vehicleClient.getVehicle(vehicleId);
        }

    public List<Vehicle> findAllStatus(){
        return vehicleClient.findAll();
    }
}
