package com.example.demo008.entity;

import java.util.ArrayList;

public class Data {
    public static  ArrayList<Book> getData(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java编程思想", "Bruce Eckel", "机械工业出版社", "0"));
        books.add(new Book(2, "Effective Java", "Joshua Bloch", "机械工业出版社", "1"));
        books.add(new Book(3, "Head First Java", "Kathy Sierra & Bert Bates", "人民邮电出版社", "2"));
        return books;
    }
    
}
