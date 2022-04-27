package com.delithe.demo.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public String myFirstethod(){
        return "Hi, This is SpringBoot ";
    }
}