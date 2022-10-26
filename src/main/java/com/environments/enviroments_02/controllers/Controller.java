package com.environments.enviroments_02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Environment environment;

    @GetMapping("/test")
    public String getTest(){
        return environment.getProperty("welcomeMsg.test");
    }

    @GetMapping("/prod")
    public String getProd(){
        return environment.getProperty("welcomeMsg.prod");
    }
}
