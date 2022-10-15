package com.luv2code.springboot.dmeo.springbootApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class AppRestController {

    //@Value jest z application.properties
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello, time on server is " + LocalDateTime.now() + ", team name: " + teamName;
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Daily Fortune";
    }
}
