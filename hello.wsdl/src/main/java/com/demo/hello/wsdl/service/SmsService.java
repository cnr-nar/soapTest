package com.demo.hello.wsdl.service;

public class SmsService implements MessageService{
    @Override
    public void sendMsg(String message) {
        System.out.println(message);
    }
}
