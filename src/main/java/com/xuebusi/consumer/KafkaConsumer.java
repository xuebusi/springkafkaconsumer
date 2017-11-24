package com.xuebusi.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 * 使用@KafkaListener注解,可以指定:主题,分区,消费组
 */
@Component
public class KafkaConsumer {

    @KafkaListener(topics = {"app_log_1"})
    public void receive1(String message){
        System.out.println("app_log_1--消费消息:" + message);
    }

    @KafkaListener(topics = {"app_log_2"})
    public void receive2(String message){
        System.out.println("app_log_2--消费消息:" + message);
    }

    @KafkaListener(topics = {"app_log_3"})
    public void receive3(String message){
        System.out.println("app_log_3--消费消息:" + message);
    }
}