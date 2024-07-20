package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.time.LocalTime;

@RestController
public class Greetings {
    @RequestMapping("/greet")
    public LocalTime greet(){
        return java.time.LocalTime.now();
    }

}
