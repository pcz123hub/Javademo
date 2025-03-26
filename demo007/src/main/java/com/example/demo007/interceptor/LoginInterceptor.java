//package com.example.demo006.interceptor;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class LoginInterceptor implements HandlerInterceptor {
//    @Override
//    public boolean preHandle (HttpServletRequest request, HttpServletResponse response,Object handler) throws Exception{
//        Object loginUser = request.getSession().getAttribute("loginUser");
//        if (loginUser == null) {
//            request.getRequestDispatcher("backend/login.html").forward(request,response);
//            return false;
//        }else {
//            //放行
//            return true;
//        }
//    }
//}
