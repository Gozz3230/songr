package com.lab11.songr.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    Integer averageAlbumlength;





    public Album(String name, Integer averageAlbumlength) {
      this.name = name;
      this.averageAlbumlength = averageAlbumlength;
    }

    protected Album() {

    }

    public long getId() {
      return id;
    }

    public void setId(long id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public Integer getAverageAlbumlength() {
      return averageAlbumlength;
    }

    public void setAverageAlbumlength(Integer averageAlbumlength) {
      this.averageAlbumlength = averageAlbumlength;
    }
  }

  @Override
  public String toString() {
    return "Album{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", averageAlbumLength=" + averageAlbumlength +
            '}';
  }
}