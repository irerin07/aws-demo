package com.example.aws_demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = HelloWorldController.RESOURCE_URI)
public class HelloWorldController {

    public static final String RESOURCE_URI = "/hello-world";

    @GetMapping
    public String read() {
        return "Hello World!";
    }

}