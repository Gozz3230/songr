package com.lab11.songr.controllers;

import com.lab11.songr.models.Album;
import com.lab11.songr.models.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AlbumController {

  @Autowired
  AlbumRepository albumRepository;

  @GetMapping("/")
  public String getAlbums(Model model) {

    List<Album> albums = albumRepository.findAll();

    model.addAttribute("albums", albums);

    return "albums.html";
  }
}