package com.lab11.songr.models.repositories;

import com.lab11.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Long> {
  // add additional methods
//  public Album findByName(String name);
}