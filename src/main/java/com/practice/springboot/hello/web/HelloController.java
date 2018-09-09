package com.practice.springboot.hello.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    String home(){
        return  "Hello! World!";
    }

    public static void main(String[] args) throws Exception{
        SpringApplication.run(HelloController.class,args);
    }
}
