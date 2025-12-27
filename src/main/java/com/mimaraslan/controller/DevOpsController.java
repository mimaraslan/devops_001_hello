package com.mimaraslan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

// http://localhost:8080
// http://127.0.0.1:8080
@RestController
@RequestMapping
public class DevOpsController {
    /*
       1
    f (x) = 2*x + 3
          = 2*1 + 3
          = 5
    */

    // http://localhost:8080
    @GetMapping
    public String devopsHello() {
        return "Hello DevOps! v3 : " + LocalDateTime.now();
    }

    // http://localhost:8080/info
    @GetMapping("info")
    public String info() {
        return "Info : " + LocalDateTime.now();
    }

}
