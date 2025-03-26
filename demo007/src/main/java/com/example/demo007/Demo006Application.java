package com.example.demo007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Demo006Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo006Application.class, args);
    }

}
