package com.sakadream.nativeimage.services.impl;

import com.sakadream.nativeimage.dto.UserDto;
import com.sakadream.nativeimage.services.HelloService;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(UserDto userDto) {
        return userDto.getUsername();
    }
    
}
