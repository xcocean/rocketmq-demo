package com.lingkang.rocketmqdemo.mq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author linke
 * @date 2020-01-20 下午 23:13
 * @description
 */
public interface MyProduce {

    @Output("test-group")
    MessageChannel log();
}
