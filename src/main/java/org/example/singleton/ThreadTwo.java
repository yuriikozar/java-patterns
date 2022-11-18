package org.example.singleton;

import org.example.singleton.DTOThreadSafe;

public class ThreadTwo implements Runnable {
  @Override
  public void run() {
    DTOThreadSafe dtoThreadSafe = DTOThreadSafe.getInstance();
    System.out.println(dtoThreadSafe);
  }
}
