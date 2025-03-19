package com.example.demo004;

import com.example.demo004.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;

@SpringBootTest
public class configureTest {
    @Autowired
    private Consumer consumer;

    @Test
    void wiredTest(){
        System.out.println("userName:"+consumer.getUsername());
        System.out.println("hobby:"+ Arrays.toString(consumer.getHobby()));
        System.out.println("subject:"+consumer.getSubject());
        System.out.println("age:"+consumer.getAge());
//        System.out.println(String.format("userName:%s, hobby:%s, subject:%s, age:%d", consumer.getUsername(), Arrays.toString(consumer.getHobby()), consumer.getSubject(), consumer.getAge()));
    }
    @Autowired
    private MyService myService;
    @Test
    void beanTest(){
        myService.getById("19");
    }

}
