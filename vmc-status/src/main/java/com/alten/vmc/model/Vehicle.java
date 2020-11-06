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
    private String status;
    private LocalDateTime recentUpdatedDateTime;
}
