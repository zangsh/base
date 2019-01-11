package com.springcloud.servicefeign.controller;

import com.springcloud.servicefeign.server.HelloServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloServer helloServer;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam(value = "name") String name){
        return helloServer.sayHello(name);
    }
}
