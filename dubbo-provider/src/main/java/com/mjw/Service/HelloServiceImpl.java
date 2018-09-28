package com.mjw.Service;

import com.alibaba.dubbo.config.annotation.Service;
import com.mjw.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
