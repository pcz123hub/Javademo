package com.example.demo010;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo010.dao.BookMapper;
import com.example.demo010.entity.EBook;
import com.example.demo010.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class Demo010ApplicationMPTests {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookService bookService;
    private void booksInfo() {
        List<EBook>eBooks= bookMapper.selectList(null); 
        for (EBook eBook : eBooks) {
            System.out.println(eBook);
        }
    }
    @Test
    void saveEBook() {
        EBook eBook = new EBook(null, "人间神话", "王国维", "清华大学出版社", "1");
        //添加图书信息
        bookMapper.insert(eBook);
        booksInfo(); 
    }
    @Test
    void findEBook() {
        QueryWrapper<EBook> wrapper = new QueryWrapper<>();
        wrapper.eq("status", "1").like("name", "词");
        List<EBook> eBooks = bookMapper.selectList(wrapper);
        for (EBook eBook : eBooks) {
            System.out.println(eBook);
        }
    }
    @Test
    void editEBook(){
        System.out.println("--------------------图书修改前---------------------");
        booksInfo();
        EBook eBook = bookService.getById(4);
        eBook.setName("楚辞");
        eBook.setPress("中华书局");
        bookService.updateById(eBook);
        System.out.println("--------------------图书修改后---------------------");
        booksInfo();
    }
    @Test
    void delEBook(){
        bookService.removeById(4);
        booksInfo();
    }
}
