package com.glw.prouder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProuderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProuderApplication.class, args);
    }

}
