package com.mkyong.core.controller;

import com.mkyong.core.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    HelloService helloService;

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Hello Controller";
    }

    @ResponseBody
    @GetMapping("/hi")
    public String hi() {
        return helloService.get();
    }

}
