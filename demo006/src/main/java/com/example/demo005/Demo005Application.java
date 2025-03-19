package com.example.demo005;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Demo005Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo005Application.class, args);
    }

}
