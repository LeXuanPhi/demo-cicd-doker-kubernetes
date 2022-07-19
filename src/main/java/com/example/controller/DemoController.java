package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "/demo")
    public String Demo(){
        return "hello cicd-docker-kubernetes";
    }
}