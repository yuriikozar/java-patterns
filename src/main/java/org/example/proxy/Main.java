package org.example.proxy;

public class Main {
  public static void main(String[] args) {
    ProxySongService proxySongService = new ProxySongService(new SomeThirdPartyApi());
    System.out.println(proxySongService.getPopularSongs());
    System.out.println("\n-------------------------");
    System.out.println("We see message that wee have put the songs in the cache");
    System.out.println("\n-------------------------");
    System.out.println(proxySongService.getPopularSongs());
    System.out.println("\n-------------------------");
    System.out.println("When we call that method second time - the songs are taken from the cache");


  }
}
