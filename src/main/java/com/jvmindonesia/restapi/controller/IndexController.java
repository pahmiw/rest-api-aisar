package com.jvmindonesia.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index(){
        return "Hello World!<br>Cars REST API -> " + new Date();
    }
}
