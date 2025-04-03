package com.example.demo008.entity;

import java.util.ArrayList;

public class Data {
    public static  ArrayList<Book> getData(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java编程思想", "Bruce Eckel", "机械工业出版社", "0"));
        books.add(new Book(2, "Effective Java", "Joshua Bloch", "机械工业出版社", "1"));
        books.add(new Book(3, "Spring Boot", "Kathy Sierra", "人民邮电出版社", "2"));
        books.add(new Book(4, "Head First Java", "Kathy Sierra", "人民邮电出版社", "0"));
        books.add(new Book(5, "Design Patterns", "Erich Gamma", "机械工业出版社", "0"));
        books.add(new Book(6, "Clean Code", "Robert C. Martin", "人民邮电出版社", "0"));
        books.add(new Book(7, "重构", "Martin Fowler", "人民邮电出版社", "1"));
        books.add(new Book(8, "代码大全", "Steve McConnell", "清华大学出版社", "2"));
        books.add(new Book(9, "深入理解Java虚拟机", "周志明", "机械工业出版社", "2"));
        books.add(new Book(10, "Java并发编程实战", "Brian Goetz", "机械工业出版社", "1"));
        books.add(new Book(11, "深入理解计算机系统", "Randal E. Bryant", "机械工业出版社", "1"));
        books.add(new Book(12, "算法导论", "Thomas H. Cormen", "机械工业出版社", "1"));
        books.add(new Book(13, "数据结构与算法分析", "Mark Allen Weiss", "清华大学出版社", "2"));
        books.add(new Book(14, "计算机网络", "Andrew S. Tanenbaum", "机械工业出版社", "0"));
        books.add(new Book(15, "操作系统", "Andrew S. Tanenbaum", "机械工业出版社", "0"));
        books.add(new Book(16, "计算机组成原理", "David A. Patterson", "机械工业出版社", "0"));
        books.add(new Book(17, "计算机体系结构", "David A. Patterson", "机械工业出版社", "1"));
        books.add(new Book(18, "数据库系统概念", "Ramez Elmasri", "机械工业出版社", "1"));
        books.add(new Book(19, "数据库原理", "Ramez Elmasri", "机械工业出版社", "2"));
        return books;
    }
    
}
