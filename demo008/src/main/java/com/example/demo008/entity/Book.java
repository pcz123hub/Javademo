package com.example.demo008.entity;

public class Book {
    private Integer id; // 图书编号
    private String name; // 图书名称
    private String author; //图书作者
    private String publisher; //图书出版社
    private String status; //图书状态

    public Book(Integer id, String name, String author, String publisher, String status) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.status = status;
    }
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}