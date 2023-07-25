package com.lab11.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeachingController {
    @GetMapping("/")
    public String getSplashPage() {
        return "splash.html";
    }
    
    @ResponseBody
    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }
}
