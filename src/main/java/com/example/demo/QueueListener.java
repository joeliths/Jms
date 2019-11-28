package com.example.demo;

import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
@EnableJms
public class QueueListener {

    @JmsListener(destination = "ExceptionQueue")
    public void HandleExceptionQueueMessage(Object message) {
        System.out.println(message);
    }

}
