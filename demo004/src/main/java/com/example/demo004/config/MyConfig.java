package com.example.demo004.config;


import com.example.demo004.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public MyService myService(){
        return new MyService();
    }
}
