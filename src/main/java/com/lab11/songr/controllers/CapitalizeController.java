package com.lab11.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Locale;

@Controller
public class CapitalizeController {
  @GetMapping("/capitalize")
  public String getCapitalizePage() {
    return "capitalize.html";
  }
  
  @GetMapping("/capitalize/{capitalType}")
  public String getCapitalsWithType(Model m, @PathVariable String capitalType) {
    
    capitalType = capitalType.toUpperCase();
    m.addAttribute("capitalType", capitalType);
    System.out.println(capitalType);    // for testing only
    return "capitalize.html";
  }
}
