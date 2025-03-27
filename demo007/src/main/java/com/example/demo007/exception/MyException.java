package com.example.demo007.exception;

public class MyException extends RuntimeException{
    //异常信息
    private String message;
    public MyException(String message){
        super(message);
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;  
    }
    public void setMessage(String message){
        this.message = message; 
    }
}
