package com.java.webapp.java;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

    @RequestMapping("/")
    public String home(){

     return "Welcome to WebApp";

}

}