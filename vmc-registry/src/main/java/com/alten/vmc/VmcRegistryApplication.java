package com.alten.vmc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VmcRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(VmcRegistryApplication.class, args);
    }

}
