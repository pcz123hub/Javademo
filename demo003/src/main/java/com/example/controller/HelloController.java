package com.example.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    @RequestMapping("/first")
    public String index(){
        System.out.println("firstController is running!");
        return "Welcome to Spring Boot Application!";
    }
}
