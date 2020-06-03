package com.colorday.service.controller;

import com.colorday.service.data.Demo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/demo")
    @CrossOrigin(origins = "http://colorday.s3-website-us-east-1.amazonaws.com")
    public Demo demo() {
        System.out.println("Hit demo()");
        return new Demo();
    }

}
