package com.yanl.consumer.controller;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-06-28 16:21:26
 * @Description: 请输入...
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-02 11:11:40
 */ 

import com.alibaba.dubbo.config.annotation.Reference;
import com.yanl.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanL
 * @date 16:21 2020/6/28
 */

@Api("helloController测试接口")
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @ApiOperation(value = "hello name", httpMethod = "GET")
    @RequestMapping("/hello")
    public String Hello(@RequestParam String name){
        String hello = helloService.sayHello(name);
        System.out.println("Hello + ly");
        return hello;
    }
}
