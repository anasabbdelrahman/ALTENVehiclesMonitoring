package com.alten.vmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class VmcMonitoringApplication {
    public static void main(String[] args) { SpringApplication.run(VmcMonitoringApplication.class, args); }
}
