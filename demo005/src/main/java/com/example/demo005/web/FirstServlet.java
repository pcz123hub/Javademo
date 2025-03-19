package com.example.demo005.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws  IOException {
        System.out.println("hello FirstServlet");
        resp.getWriter().write("hello FirstServlet");
    }
}
