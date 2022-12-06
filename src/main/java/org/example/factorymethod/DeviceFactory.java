package org.example.factorymethod;

public class DeviceFactory {
  public static Device getDevice(boolean ultimate) {
    return ultimate ? new UltimateDevice() : new DefaultDevice();
  }
}
