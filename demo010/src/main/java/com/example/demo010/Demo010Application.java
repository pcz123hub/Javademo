package com.example.demo010;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.demo010.dao")
@SpringBootApplication
public class Demo010Application {
    public static void main (String[] args){
        SpringApplication.run(Demo010Application.class,args);
    }
}
