package org.example.proxy;

import java.util.Map;

public class MusicPlayer {
  private final SomeSongService  someSongService;

  public MusicPlayer(SomeSongService someSongService) {
    this.someSongService = someSongService;
  }

  public Map<String, Song> getPopularSongs() {
    return someSongService.getPopularSongs();
  }
}
