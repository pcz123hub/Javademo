package com.example.demo009.dao;

import com.example.demo009.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
    Book findByAuthorAndStatus(String author, String status);
    @Modifying
    @Transactional
    @Query("delete from Book b where b.id = :id")
    // 修改返回类型为void以匹配CrudRepository的deleteById方法
    void deleteById(@Param("id") Integer id);

}