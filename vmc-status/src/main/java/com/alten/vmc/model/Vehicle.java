package com.alten.vmc.model;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    private String id;
    private String name;
    private String model;
    private String plateNumber;
    private String registrationNumber;
    private LocalDateTime recentUpdatedDateTime;

    public Vehicle(String id, String name, String model, String plateNumber, String registrationNumber, LocalDateTime recentUpdatedDateTime) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.plateNumber = plateNumber;
        this.registrationNumber = registrationNumber;
        this.recentUpdatedDateTime = recentUpdatedDateTime;
    }
}
