package com.colorday.service.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoController {

    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        System.out.println("Hit demo()");

        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "*");

        return new ResponseEntity<>("hello world", headers, HttpStatus.OK);
    }

}
