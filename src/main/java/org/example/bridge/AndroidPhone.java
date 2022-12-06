package org.example.bridge;

public class AndroidPhone extends Phone {
  public AndroidPhone(RAM ram) {
    super.ram = ram;
  }
  @Override
  public void doSomething() {
    System.out.println("That is an android phone with ram: " + super.ram.getCurrentRam());
  }
}
