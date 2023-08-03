package org.example.proxy;

import java.util.Map;

public class ProxySongService implements SomeSongService {
  private final SomeThirdPartyApi someThirdPartyApi;
  private Map<String, Song> cache;

  public ProxySongService(SomeThirdPartyApi someThirdPartyApi) {
    this.someThirdPartyApi = someThirdPartyApi;
  }

  @Override
  public Map<String, Song> getPopularSongs() {
    if (cache == null) {
      System.out.println("We`re putting data in the cache");
      cache = someThirdPartyApi.getPopularSongs();
    }
    return cache;
  }
}
