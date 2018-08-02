package com.demo.servicerock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceRockApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRockApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/rock")
    public String rock(@RequestParam(value = "name", defaultValue = "su") String name){
        return "hi rock- " + name + " ,i am from port:" + port;
    }
}
