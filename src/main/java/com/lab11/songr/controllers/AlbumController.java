package com.lab11.songr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller

public class AlbumController {
  @GetMapping("/albums")
  public String getAlbumsPage() {
    return "albums.html";
  }

  @GetMapping("/cookies/{cookieType}")
  public String getCookiesWithType(Model m, @PathVariable String albumType) {
    return "albums.html";
  }

}
