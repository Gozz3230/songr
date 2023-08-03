package com.lab11.songr.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String title;
    private String artist;
    private Integer songCount;
    private Integer length;
    private String imageUrl;
    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Song> songs;






    public Album(String title, String artist, Integer songCount, Integer length, String imageUrl) {
      this.title = title;
      this.artist = artist;
      this.songCount = songCount;
      this.length = length;
      this.imageUrl = imageUrl;
    }

  public Album(long id, String title, String artist, Integer songCount, Integer length, String imageUrl) {
    this.id = id;
    this.title = title;
    this.artist = artist;
    this.songCount = songCount;
    this.length = length;
    this.imageUrl = imageUrl;
  }

    protected Album() {

    }

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public String getTitle() {
      return title;
    }

    public void setTitle(String title) {
      this.title = title;
    }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public Integer getSongCount() {
    return songCount;
  }

  public void setSongCount(Integer songCount) {
    this.songCount = songCount;
  }

  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public List<Song> getSongs() {
    return songs;
  }

  public void setSongs(List<Song> songs) {
    this.songs = songs;
  }


  @Override
  public String toString() {
    return "Album{" +
            "title='" + title + '\'' +
            ", artist='" + artist + '\'' +
            ", songCount=" + songCount +
            ", length=" + length +
            ", imageUrl='" + imageUrl + '\'' +
            '}';
  }
}