package com.yanl.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yanl.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author YanL
 * @date 16:13 2020/6/28
 */
@Service
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
