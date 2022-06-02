package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    //demo api
    @GetMapping(value = "/hello")
    @ResponseBody
    public  String hello (@RequestBody String re){
        return "hello word";
    }

}
