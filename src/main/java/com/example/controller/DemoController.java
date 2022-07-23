package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class DemoController {
    Logger logger = Logger.getLogger(DemoController.class.getName());
    @RequestMapping(value = "/demo")
    public String Demo(){
        logger.info("Tao test duoc roi");

        return "hello cicd-docker-kubernetes";
    }
}