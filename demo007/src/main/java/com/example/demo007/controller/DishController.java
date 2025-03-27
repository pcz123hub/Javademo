package com.example.demo007.controller;

import com.example.demo007.exception.MyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dish")
public class DishController {
    @RequestMapping("/del/{i}")
    public ResponseEntity<String> delDish (@PathVariable String i) {
        Integer id = Integer.valueOf(i);
        if (id<0) {
            throw new MyException("参数错误！");
        }
        return new ResponseEntity<>("del success", HttpStatus.OK);
    }
}
