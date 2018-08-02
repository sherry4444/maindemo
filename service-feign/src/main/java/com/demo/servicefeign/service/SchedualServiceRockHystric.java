package com.demo.servicefeign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceRockHystric implements SchedualServiceRock{

    @Override
    public String sayRockFromClientOne(String name) {
        return "sorry "+name;
    }
}
