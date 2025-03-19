package com.example.demo004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Demo004Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo004Application.class, args);
    }

}
