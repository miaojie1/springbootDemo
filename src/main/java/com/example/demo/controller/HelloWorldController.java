package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index() {
        return "Hello World1";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test(@RequestParam("userId") Integer id){
        return "hello" + id;
    }
}
