package org.example.abtractfactory;

import java.util.NoSuchElementException;

public class IosFactory implements AbstractFactory<Ios> {
  @Override
  public Ios create(String type) {
    if ("IPhone".equals(type))
      return new IPhone();
    if ("IPad".equals(type))
      return new IPad();
    throw new NoSuchElementException();
  }
}
