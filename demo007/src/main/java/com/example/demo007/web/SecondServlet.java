package com.example.demo007.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SecondServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws  IOException {
            System.out.println("hello SecondServlet");
            resp.getWriter().write("hello SecondServlet");
    }
}
