package com.sinosoft.analysis.controller;

import com.sinosoft.analysis.service.feign.HomeSchedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HomeSchedule homeSchedule;

    @RequestMapping("")
    public String home(){
        return "remote call ---> " + homeSchedule.home();
    }

    @RequestMapping("/port")
    public String port(){
        return "remote call ---> " + homeSchedule.port();
    }
}
