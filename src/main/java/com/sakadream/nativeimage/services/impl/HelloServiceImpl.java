package com.sakadream.nativeimage.services.impl;

import com.sakadream.nativeimage.models.User;
import com.sakadream.nativeimage.services.HelloService;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(User user) {
        return String.format("Hello, %s!", user.getName());
    }
    
}
