package com.example.demo007.web;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.annotation.WebFilter;

@WebFilter("/first")
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException{
        System.out.println("处理请求前的处理");
        filterChain.doFilter(req,resp);
        System.out.println("处理请求后的处理");
    }
}
