package com.lab11.songr.models.repositories;

import com.lab11.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
  public Song findByTitle(String title);
}