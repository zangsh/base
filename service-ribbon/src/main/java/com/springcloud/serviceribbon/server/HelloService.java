package com.springcloud.serviceribbon.server;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallbackForHello")
    public String sayHello(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name={name}",String.class,name);
    }

    public String fallbackForHello(String name){
        return "调用 EUREKA-CLIENT 服务失败！";
    }
}
