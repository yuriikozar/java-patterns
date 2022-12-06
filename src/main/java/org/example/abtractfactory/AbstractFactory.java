package org.example.abtractfactory;

public interface AbstractFactory <T> {
  T create (String type);
}
