package org.example.bridge;

public class DefaultRAM implements RAM {
  @Override
  public int getCurrentRam() {
    return 4;
  }
}
