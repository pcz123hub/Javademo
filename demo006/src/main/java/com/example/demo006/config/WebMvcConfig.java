package com.example.demo006.config;

//import com.example.demo006.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/backend/**").addResourceLocations("classpath:/backend/");
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/backend/toLoginPage").setViewName("/backend/login.html");
        registry.addViewController("/backend").setViewName("/backend/index.html");
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //拦截所有请求，包括静态资源文件
//        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/backend/login.html");
//    }
}
