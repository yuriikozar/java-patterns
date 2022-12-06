package org.example.factorymethod;

public class FactoryMain {
  public static void main(String[] args) {
    Device ultimateDevice = DeviceFactory.getDevice(true);
    Device defaultDevice = DeviceFactory.getDevice(false);
    System.out.println(ultimateDevice);
    System.out.println(defaultDevice);
  }
}
