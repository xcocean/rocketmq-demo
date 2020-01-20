package com.lingkang.rocketmqdemo;

import com.lingkang.rocketmqdemo.mq.MyConsumer;
import com.lingkang.rocketmqdemo.mq.MyProduce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({MyProduce.class, MyConsumer.class})
public class RocketmqDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketmqDemoApplication.class, args);
    }
}
