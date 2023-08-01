package com.lab11.songr.controllers;

import com.lab11.songr.models.Album;
import com.lab11.songr.models.Song;
import com.lab11.songr.models.repositories.AlbumRepository;
import com.lab11.songr.models.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

  @Autowired
  AlbumRepository albumRepository;

  @Autowired
  SongRepository songRepository;


  @PostMapping("/song/add")
  public RedirectView addSong(String name, Integer timePerSong, String albumName) {
    Album Album = albumRepository.findByName(albumName);

    if (album == null) {
      throw new IllegalArgumentException("Could not find album with name " + albumName);
    }

    Song song = new Song(name, timePerSong, album);
    songRepository.save(song);

    return new RedirectView("/");

  }
}