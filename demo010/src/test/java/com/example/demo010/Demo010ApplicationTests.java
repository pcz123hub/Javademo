package com.example.demo010;
import com.example.demo010.dao.BookRepository;
import com.example.demo010.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class Demo010ApplicationTests {
    @Autowired
    private BookRepository bookRepository;

    private void booksInfo() {
        List<Book> books = bookRepository.findAll();
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Test
        //添加
    void saveBook() {
        Book book = new Book(null, "离骚", "屈原", "清华大学出版社", "1");
        bookRepository.save(book);
        booksInfo();
    }
    @Test
    //编辑
    void editBook(){
        Optional<Book> op = bookRepository.findById(1);
        Book book = op.get();
        book.setName("天");
        //修改图书信息
        bookRepository.save(book);
        booksInfo();
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
       bookRepository.deleteById(4);
       booksInfo();
   }
}
