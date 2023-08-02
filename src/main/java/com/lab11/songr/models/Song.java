package com.lab11.songr.models;

import jakarta.persistence.*;

@Entity
public class Song {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;

  String title;
  Integer length;
  Integer trackNumber;

  @ManyToOne
  Album album;

  public Song(String title, Integer length, Integer trackNumber, Album album) {
    this.title = title;
    this.length = length;
    this.trackNumber = trackNumber;
    this.album = album;
  }

  protected Song() {
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Integer getTrackNumber() {
    return trackNumber;
  }

  public void setTrackNumber(Integer trackNumber) {
    this.trackNumber = trackNumber;
  }

  public Album getAlbum() {
    return album;
  }

  public void setAlbum(Album album) {
    this.album = album;
  }

  @Override
  public String toString() {
    return "Song{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", length=" + length +
            ", trackNumber=" + trackNumber +
            ", album=" + album +
            '}';
  }
}


