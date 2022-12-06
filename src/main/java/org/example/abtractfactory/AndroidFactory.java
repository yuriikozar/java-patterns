package org.example.abtractfactory;

import java.util.NoSuchElementException;

public class AndroidFactory implements AbstractFactory<Android> {
  @Override
  public Android create(String type) {
    if ("Samsung".equals(type)) {
      return new Samsung();
    }
    if ("Xiaomi".equals(type)) {
      return new Xiaomi();
    }
    throw new NoSuchElementException();
  }
}
