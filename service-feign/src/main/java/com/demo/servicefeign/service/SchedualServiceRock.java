package com.demo.servicefeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-rock",fallback = SchedualServiceRockHystric.class)
public interface SchedualServiceRock {

    @RequestMapping(value = "/rock",method = RequestMethod.GET)
    String sayRockFromClientOne(@RequestParam(value = "name") String name);

}
