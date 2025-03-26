package com.example.demo007.WebConfigure;

//使用Spring Bean 注册Java Web三大组件
//@Configuration
//public class WebConfigure {
//    @Bean("firstServlet")
//    public FirstServlet firstServlet(){
//        return new FirstServlet();
//    }
//    @Bean("secondServlet")
//    public SecondServlet secondServlet(){
//        return new SecondServlet();
//    }
//    @Bean
//    public MyFilter myFilter(){
//        return new MyFilter();
//    }
//    @Bean
//    public MyListener myListener(){
//        return new MyListener();
//    }
//}

//使用RegistrationBean注册Java Web三大组件
//@Configuration
//public class WebConfigure {
//    @Bean
//    public ServletRegistrationBean firstServlet(){
//        return new ServletRegistrationBean(new FirstServlet(),"/first");
//    }
//    @Bean
//    public ServletRegistrationBean secondServlet(){
//        return new ServletRegistrationBean(new SecondServlet(),"/second");
//    }
//    @Bean
//    public FilterRegistrationBean myFilter(){
//        FilterRegistrationBean filterRegistrationBean=
//                new FilterRegistrationBean(new MyFilter());
//        filterRegistrationBean.setUrlPatterns(Arrays.asList("/first"));
//        return filterRegistrationBean;
//    }
//    @Bean
//    public ServletListenerRegistrationBean myListener(){
//        return new ServletListenerRegistrationBean(new MyListener());
//    }
//}
