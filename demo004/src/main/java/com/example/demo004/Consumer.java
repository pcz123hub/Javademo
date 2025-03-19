package com.example.demo004;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Consumer {
    @Value("${consumer.username}")
    private String username;

    @Value("${consumer.age}")
    private int age;

    @Value("#{'${consumer.hobby}'.split(',')}")
    private String[] hobby;

    @Value("${consumer.subject}")
    private List subject;


    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List getSubject() {
        return subject;
    }

    public void setSubject(List subject) {
        this.subject = subject;
    }

    public String toString() {
        return "Consumer{" +
                "username='" + username + '\'' +
                ",age=" + age +
                ",hobby=" + Arrays.toString(hobby) +
                ",subject=" + subject +
                "}";
    }
}
