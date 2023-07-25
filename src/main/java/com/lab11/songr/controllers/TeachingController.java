package com.lab11.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    
    @GetMapping("/album")
    public String getAlbumPage(Model m) {
        m.addAttribute("title");
        m.addAttribute("artist");
        m.addAttribute("songCount");
        m.addAttribute("length");
        return "album.html";
    }
    
}
