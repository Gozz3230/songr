package com.lab11.songr.models.repositories;

import com.lab11.songr.models.AlbumShelf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumShelfRepository extends JpaRepository<AlbumShelf, Long> {
  // by default i would have save(), delete(), update(), findAll() without adding to this class

  // t add MAGIC method declarations
  public AlbumShelf findByName(String name);
}
