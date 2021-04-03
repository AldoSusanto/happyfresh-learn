package com.happyfresh.learn.configuration;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Queue;

@Configuration
public class ActiveMQConfiguration {

    private String brokerUrl = "tcp://localhost:61616";

    @Bean
    public Queue queue(){
        return new ActiveMQQueue("test-queue");
    }

    @Bean
    public ActiveMQConnectionFactory ActiveMQCustomConnectionFactory(){
        ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory();
        factory.setBrokerURL(brokerUrl);
        return factory;
    }

    @Bean
    public JmsTemplate jmsTemplate(){
        return new JmsTemplate(ActiveMQCustomConnectionFactory());
    }
}
