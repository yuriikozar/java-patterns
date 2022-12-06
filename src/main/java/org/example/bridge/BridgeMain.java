package org.example.bridge;

public class BridgeMain {
  public static void main(String[] args) {
    Phone iphoneWithDefaultRam = new ApplePhone(new DefaultRAM());
    iphoneWithDefaultRam.doSomething();
    Phone androidPhoneWithExtendedRam = new AndroidPhone(new ExtendedRAM());
    androidPhoneWithExtendedRam.doSomething();
  }
}
