package com.example.demo007;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Demo007Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo007Application.class, args);
    }

}
