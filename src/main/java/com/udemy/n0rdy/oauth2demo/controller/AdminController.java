package com.udemy.n0rdy.oauth2demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @GetMapping("/admin/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name;
    }
}
