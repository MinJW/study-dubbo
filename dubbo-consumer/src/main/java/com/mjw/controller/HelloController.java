package com.mjw.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mjw.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name){
        System.out.println("=-=-=-=-=->>>>>" + helloService);
        return helloService.hello(name);
    }

}
