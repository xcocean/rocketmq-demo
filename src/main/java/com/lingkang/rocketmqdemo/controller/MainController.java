package com.lingkang.rocketmqdemo.controller;

import com.lingkang.rocketmqdemo.mq.MyConsumer;
import com.lingkang.rocketmqdemo.mq.MyProduce;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linke
 * @date 2020-01-19 下午 21:08
 * @description
 */
@RestController
public class MainController {

    @Autowired
    private MyProduce myProduce;

    @GetMapping("send")
    public Object send(String msg) throws Exception {
        myProduce.log().send(MessageBuilder.withPayload(msg).build());
        return "";
    }

    @GetMapping("send1")
    public Object send1(String msg) {
        //带上标签发送
        MessageBuilder builder = MessageBuilder.withPayload(msg)
                .setHeader(RocketMQHeaders.TAGS, "log")
                .setHeader(RocketMQHeaders.KEYS, "my-key")
                .setHeader("DELAY", "1");
        Message message = builder.build();
        myProduce.log().send(message);
        return message;
    }

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("consumer")
    public Object consumer(){
        return "";
    }
}
