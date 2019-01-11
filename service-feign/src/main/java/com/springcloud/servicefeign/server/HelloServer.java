package com.springcloud.servicefeign.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = HelloError.class)
public interface HelloServer {
    @RequestMapping(value = "/hello")
    String sayHello(@RequestParam(value = "name") String name);
}
