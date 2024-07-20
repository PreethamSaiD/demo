package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wishes {
    @RequestMapping("/wish")
    public String wish(){
        return "Your wish has been fulfilled";
    }

}
