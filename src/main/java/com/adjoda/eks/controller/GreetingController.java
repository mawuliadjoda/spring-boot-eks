package com.adjoda.eks.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/greetings")
    public Message message() {
        return new Message("Welcome to adjoda-dev! app deployed in AWS EKS");
    }

    record Message(String data){};

}
