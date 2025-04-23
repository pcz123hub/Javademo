package com.example.demo009;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo009.dao.BookRepository;
import com.example.demo009.entity.Book;

@SpringBootTest
class Demo009ApplicationTests {
    @Autowired
    private BookRepository bookRepository;
    private void bookInfo(){
       List<Book> books = bookRepository.findAll();
       for(Book book : books){
        System.out.println(book);
       } 
    }
    @Test
    void saveBook(){
        Book book = new Book(null, "《天问》", "屈原", "湖南文艺出版社", "1");
        //新增图书信息
        bookRepository.save(book);
        bookInfo();
    }
    @Test
    void editBook(){
        Optional<Book> op = bookRepository.findById(1);
        Book book = op.get();
        book.setName("天问");
        //修改图书信息
        bookRepository.save(book);
        bookInfo();
    }
    @Test
    void findBook(){
            //根据作者和状态查询
            Book b = bookRepository.findByAuthorAndStatus("屈原", "1");
            System.out.println(b);
    }
    @Test
    void delBook(){
        //根据id删除图书信息
        bookRepository.deleteById(1);
        bookInfo();
    }
    @Test
    void contextLoads() {
    }

}
