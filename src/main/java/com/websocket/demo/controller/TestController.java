package com.websocket.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/h",method={RequestMethod.POST, RequestMethod.GET})
    public String hello(){
        System.out.println("in hello");
        return "hello";
    }
}
