package com.service2.demo_service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Service2Controller {
    @GetMapping("/hello")
            public String sayHelloService2(){
                return "hello Serive 2";
            }
}
