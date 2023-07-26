package com.lab11.songr.controllers;

import com.lab11.songr.models.AlbumShelf;
import com.lab11.songr.models.repositories.AlbumShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class AlbumController {
  // 6 add Autowired instance of repo to the controller
  @Autowired
  AlbumShelfRepository albumShelfRepository;

  @GetMapping("/albums")
  public String getAlbumsPage() {
    return "albums.html";
  }

  @GetMapping("/albums/{albumType}")
  public String getAlbumsWithType(Model m,
                                   @PathVariable String albumType,
                                   @RequestParam(required = false, defaultValue = " is the album showing") String albumString) {

  m.addAttribute("albumType", albumType + albumString);
  return "albums.html";
  }

  @GetMapping("/shelves")
  public String getShelvesPage() {
    return "album-shelf.html";
  }

  @PostMapping("/album-shelf/")
  public RedirectView addShelfFromForm(String shelfName, Integer averageSoldPerDay) {
    AlbumShelf newShelf = new AlbumShelf(shelfName, averageSoldPerDay);
    albumShelfRepository.save(newShelf);

    return new RedirectView("/");
  }

}
