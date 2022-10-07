package com.example.helloheroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String hello(){
        return "Hello, Heroku!!!";
    }

}
