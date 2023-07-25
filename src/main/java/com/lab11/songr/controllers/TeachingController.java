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
        m.addAttribute("title", "Sadnecessary");
        m.addAttribute("artist", "Milky Chance");
        m.addAttribute("songCount", "14");
        m.addAttribute("length", "3,333");
        return "albums.html";
    }
    
}
