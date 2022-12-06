package org.example.bridge;

public class ApplePhone extends Phone {
  public ApplePhone(RAM ram) {
    super.ram = ram;
  }
  @Override
  public void doSomething() {
    System.out.println("That is an apple phone with ram: " + super.ram.getCurrentRam());
  }
}
