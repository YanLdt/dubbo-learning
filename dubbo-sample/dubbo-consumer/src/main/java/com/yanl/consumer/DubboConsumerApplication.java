package com.yanl.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author YanL
 * @date 16:18 2020/6/28
 * 整合了swagger接口文档
 * 并且实现了dubbo的简单示例
 */
@SpringBootApplication
@EnableDubboConfiguration
@EnableSwagger2
public class DubboConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }
}
