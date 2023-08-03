package org.example.proxy;

import java.util.HashMap;
import java.util.Map;

public class SomeThirdPartyApi implements SomeSongService{
  public Map<String, Song> getPopularSongs() {
    Map<String, Song> songs = new HashMap<>();
    songs.put("songId1", new Song("songId1", new byte[] {11, 27, 24}));
    songs.put("songId2", new Song("songId2", new byte[] {14, 23, 35}));
    songs.put("songId3", new Song("songId3", new byte[] {7, 3, 54}));
    return songs;
  }
}
