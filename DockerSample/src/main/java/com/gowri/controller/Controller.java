package com.gowri.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/v1/hello")
    public String hello() {
        return "hello";
    }
}
