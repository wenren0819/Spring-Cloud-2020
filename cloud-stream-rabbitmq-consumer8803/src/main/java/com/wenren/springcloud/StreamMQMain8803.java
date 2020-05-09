package com.wenren.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;

/**
 * @author wangyang
 * @version V1.0
 * @create 2020-05-09-15:08
 */
@SpringBootApplication(exclude = {RabbitAutoConfiguration.class})
public class StreamMQMain8803 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8803.class, args);
    }
}
