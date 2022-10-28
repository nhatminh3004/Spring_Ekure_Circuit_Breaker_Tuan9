package com.service1.demo_service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Serivce1Controller {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Serivce 1";
    }
}
