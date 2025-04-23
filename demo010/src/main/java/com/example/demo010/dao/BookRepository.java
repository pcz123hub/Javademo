package com.example.demo010.dao;

import com.example.demo010.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
    Book findByAuthorAndStatus(String author, String status);
    @Modifying
    @Transactional
    @Query("delete from Book b where b.id = :id")
    void deleteById(@Param("id") Integer id);
    List<Book> deleteBookById(@Param("id") Integer id);
}