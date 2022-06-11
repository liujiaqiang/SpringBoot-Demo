package com.gj.lisenter;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitReceiver {
    @RabbitListener(queues = "luoyong-queue")  //指定队列
    public void process(String msg) {
        System.out.println("Receiver  : 消费成功：" + msg);
    }
}
