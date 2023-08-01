package com.lab11.songr.controllers;

import com.lab11.songr.models.Album;
import com.lab11.songr.models.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class AlbumController {

  @Autowired
  AlbumRepository albumRepository;

  @GetMapping("/")
  public String getAllAlbums(Model model) {

    List<Album> albums = albumRepository.findAll();

    model.addAttribute("albums", albums);

    return "albums.html";
  }

  @PostMapping("/create")
  public RedirectView createStand(String name, Integer averageAlbumLength) {
    Album newAlbum = new Album(name, averageAlbumLength);

    albumRepository.save(newAlbum);

    return new RedirectView("/");
  }
}