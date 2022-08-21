package com.mypack.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixFollBackController {

    @GetMapping("/userServiceFallBack")
    public String HystrixFallBack(){
        return "User server taking time as expected" +
                "Please try again";
    }
    @GetMapping("/departmentServiceFallBack")
    public String departmentHystrixFallBack(){
        return "Department server taking time as expected" +
                "Please try again";
    }
}
