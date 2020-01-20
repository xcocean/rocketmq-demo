package com.lingkang.rocketmqdemo.mq;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author linke
 * @date 2020-01-20 下午 23:38
 * @description
 */
@Component
public class MyConsumerReceive {

    @StreamListener("input-consumer")
    public void receiveConsumer(Object msg) {
        System.out.println("消息消费：" + msg);
    }
}
