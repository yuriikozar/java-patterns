package org.example.singleton;

public class DTOThreadSafe {
  private static DTOThreadSafe instance;

  private DTOThreadSafe() {

  }

  public static DTOThreadSafe getInstance() {
    if (instance != null) {
      return instance;
    }
    synchronized (DTOThreadSafe.class) {
      if (instance == null ) {
        instance = new DTOThreadSafe();
      }
      return instance;
    }
  }
}
