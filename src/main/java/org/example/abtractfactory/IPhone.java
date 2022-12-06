package org.example.abtractfactory;

public class IPhone implements Ios {
  @Override
  public void doSomething() {
      System.out.println("This is Iphone implementation");
  }
}
