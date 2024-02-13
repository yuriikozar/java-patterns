package org.example.adapter;

public class Demo {

  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();

    System.out.println("Playing MP3 file:");
    audioPlayer.play("mp3", "beyond the horizon.mp3");

    System.out.println("\nPlaying MP4 file:");
    audioPlayer.play("mp4", "alone.mp4");

    System.out.println("\nPlaying VLC file:");
    audioPlayer.play("vlc", "far far away.vlc");

    System.out.println("\nPlaying AVI file:");
    audioPlayer.play("avi", "mind me.avi");
  }
}
