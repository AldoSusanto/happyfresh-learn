package com.happyfresh.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class TestController {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Queue queue;

    public static final String TOPIC = "test.topic";

    @GetMapping("/")
    public String testAPI(){
        return "hello world !";
    }

    @GetMapping("/kafka/{message}")
    public String testAPIKafka(@PathVariable String message){
//        kafkaTemplate.send(TOPIC, message); // Default configs on the kafka, no configuration class (localhost:9092)
        return message;
    }

    @GetMapping("/mq/{message}")
    public String testAPIQueue(@PathVariable String message){
        jmsTemplate.convertAndSend(queue, message);
        return message;
    }

}
