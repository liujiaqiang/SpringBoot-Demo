package com.gj.web.api;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
public class RabbitMqController {
    @Autowired
    private AmqpTemplate rabbitTemplate;


    @GetMapping("sendMq")
    public String sendMq() {
        String msg = "简单队列-hello呀";
        System.out.println("Sender : " + msg);
        this.rabbitTemplate.convertAndSend("luoyong-queue", msg);
        return "success";
    }
}
