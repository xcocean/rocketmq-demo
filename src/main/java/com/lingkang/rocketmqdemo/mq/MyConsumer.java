package com.lingkang.rocketmqdemo.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * @author linke
 * @date 2020-01-20 下午 23:43
 * @description
 */
public interface MyConsumer {
    @Input("input-consumer")
    MessageChannel log();
}
