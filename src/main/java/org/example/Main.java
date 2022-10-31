package org.example;

import org.example.builder.Human;

public class Main {
  public static void main(String[] args) {
    Human anna = new Human.HumanBuilder().firstName("Anna").lastName("Martynenko").age(19).build();
    System.out.println(anna);
  }
}