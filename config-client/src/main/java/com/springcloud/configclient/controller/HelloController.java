package com.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Value("${file}")
    String file;

    @Value("${info.name}")
    String infoName;

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello " + file + " , " + infoName;
    }
}
