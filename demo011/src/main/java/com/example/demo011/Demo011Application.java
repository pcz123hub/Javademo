package com.example.demo011;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demo011.dao")
@SpringBootApplication
public class Demo011Application {
    public static void main (String[] args){
        SpringApplication.run(Demo011Application.class,args);
    }
}
