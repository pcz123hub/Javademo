package com.example.demo007.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce){
        System.out.println("---Web应用初始化完成---");
    }
    @Override
    public void contextDestroyed(ServletContextEvent sce){
        System.out.println("---Web应用销毁之前---");
    }
}
