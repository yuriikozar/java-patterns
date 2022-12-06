package org.example.abtractfactory;

public class AbstractFactoryMain {
  public static void main(String[] args) {
    IosFactory iosFactory = (IosFactory) FactoryProvider.getFactory("Ios");
    AndroidFactory androidFactory = (AndroidFactory) FactoryProvider.getFactory("Android");

    Ios iphone = iosFactory.create("IPhone");
    Android xiaomi = androidFactory.create("Xiaomi");
    System.out.println(iphone);
    System.out.println(xiaomi);
    iphone.doSomething();
    xiaomi.doSomething();
  }
}
