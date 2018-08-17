package com.sinosoft.analysis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/")
    public String home(){
        return "home page";
    }

    @RequestMapping("/port")
    public String portInfo(){
        return "server port = " + port;
    }
}
