package com.bikram.login.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {
    
    @GetMapping("/home")
    public String getHome(@RequestParam String param) {
        return "Lol";
    }

    @GetMapping("/secured")
    public String getMethodName(@RequestParam String param) {
        return "Secured Route";
    }
    
    
}
