package com.demo.hello.wsdl.service;

public class MessageProcessorImpl implements MessageProcessor{

    private MessageService messageService;
    public void setMessageService (MessageService messageService){
        this.messageService = messageService;
    }
    @Override
    public void processMsg(String message) {
        messageService.sendMsg(message);
    }
}
