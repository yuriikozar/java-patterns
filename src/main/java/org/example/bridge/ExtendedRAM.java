package org.example.bridge;

public class ExtendedRAM implements RAM {
  @Override
  public int getCurrentRam() {
    return 6;
  }
}
