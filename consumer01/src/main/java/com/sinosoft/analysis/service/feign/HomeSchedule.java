package com.sinosoft.analysis.service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider01")
public interface HomeSchedule {
    @RequestMapping("/")
    String home();

    @RequestMapping("/port")
    String port();
}
