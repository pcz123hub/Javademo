package com.example.demo008.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping("list")
    public String findHello(Model model){
       return "index";
    }
}
