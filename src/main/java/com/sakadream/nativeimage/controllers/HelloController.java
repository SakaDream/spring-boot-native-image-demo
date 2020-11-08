package com.sakadream.nativeimage.controllers;

import com.sakadream.nativeimage.dto.UserDto;
import com.sakadream.nativeimage.services.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private HelloService helloService;
    
    @PostMapping
    public ResponseEntity<String> hello(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(helloService.hello(userDto));
    }

}
