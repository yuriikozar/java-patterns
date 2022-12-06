package org.example.abtractfactory;

import java.util.NoSuchElementException;

public class FactoryProvider {
  public static AbstractFactory getFactory(String choice){

    if("Android".equalsIgnoreCase(choice)){
      return new AndroidFactory();
    }
    else if("Ios".equalsIgnoreCase(choice)){
      return new IosFactory();
    }

    throw new NoSuchElementException();
  }
}
