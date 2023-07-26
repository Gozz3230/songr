package com.lab11.songr.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// 1. add @Entity to class
@Entity
public class AlbumShelf {
  // 2 @Id prop to class
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
  String name;
  Integer averageTimeOnAlbum;

  // 3 add protected default const


  protected AlbumShelf() {
  }

  public AlbumShelf(long id, String name, Integer averageTimeOnAlbum) {
    this.id = id;
    this.name = name;
    this.averageTimeOnAlbum = averageTimeOnAlbum;
  }

  public AlbumShelf(String name, Integer averageTimeOnAlbum) {
    this.name = name;
    this.averageTimeOnAlbum = averageTimeOnAlbum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAverageTimeOnAlbum() {
    return averageTimeOnAlbum;
  }

  public void setAverageTimeOnAlbum(Integer averageTimeOnAlbum) {
    this.averageTimeOnAlbum = averageTimeOnAlbum;
  }
}
