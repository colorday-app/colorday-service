package com.colorday.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/demo")
    public String demo() {
        System.out.println("Hit demo()");
        return "Hello world!";
    }

}
