package com.lab11.songr.controllers;

import com.lab11.songr.models.Album;
import com.lab11.songr.models.Song;
import com.lab11.songr.models.repositories.AlbumRepository;
import com.lab11.songr.models.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SongController {

  @Autowired
  AlbumRepository albumRepository;

  @Autowired
  SongRepository songRepository;


  @GetMapping("/")
  public String getSplashPage(Model m) {
    List<Album> albumsArray = albumRepository.findAll();

    m.addAttribute("albums", albumsArray);

    return "splash";
  }

  @ResponseBody
  @GetMapping("/hello")
  public String getHelloWorld() {
    return "Hello World";
  }

  @GetMapping("/add-album")
  public String getAlbumsPage() {
    return "albums.html";
  }

  @PostMapping("/add-album")
  public RedirectView addAlbumFromForm(String title, String artist, Integer songCount, Integer length, String imageUrl) {
    Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
    albumRepository.save(newAlbum);

    return new RedirectView("/");
  }

  @GetMapping("/{id}")
  public String getOneAlbum(Model m, @PathVariable Long id) {
    Album album = albumRepository.getById(id);
    m.addAttribute("album", album);
    return "album.html";
  }

  @PostMapping("/add-song/{id}")
  public RedirectView addSongFromForm(String title, Integer length, Integer trackNumber, String album) {
    Album storedAlbum = albumRepository.findByTitle(album);

    if (storedAlbum == null) {
      throw new IllegalArgumentException("Could not find Album");
    }
    Song newSong = new Song(title, length, trackNumber, storedAlbum);
    songRepository.save(newSong);

    return new RedirectView("/" + storedAlbum.getId());
  }
}