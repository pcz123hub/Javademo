package com.example.demo010.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo010.dao.BookMapper;
import com.example.demo010.entity.EBook;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, EBook> implements BookService {

}
