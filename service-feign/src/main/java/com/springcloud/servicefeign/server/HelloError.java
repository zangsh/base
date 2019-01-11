package com.springcloud.servicefeign.server;

import org.springframework.stereotype.Component;

@Component
public class HelloError implements HelloServer{
    @Override
    public String sayHello(String name) {
        System.out.println(".....................熔断处理............");
        return "Hystrix ，服务调用失败";
    }
}
