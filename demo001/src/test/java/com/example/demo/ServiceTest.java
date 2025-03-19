package com.example.demo;

import com.example.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class ServiceTest {
    @Autowired
    private HelloService helloService;
    @Test
    void testService(){
        helloService.getById(13);
    }
}
