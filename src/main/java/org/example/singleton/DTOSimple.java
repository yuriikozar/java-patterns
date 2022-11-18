package org.example.singleton;

public class DTOSimple {
  private static DTOSimple instance;

  private DTOSimple() {

  }

  public static DTOSimple getInstance() {
    if (instance == null) {
      instance = new DTOSimple();
    }
    return instance;
  }
}
