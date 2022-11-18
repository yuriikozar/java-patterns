package org.example;

import org.example.builder.Human;
import org.example.singleton.DTOSimple;
import org.example.singleton.ThreadOne;
import org.example.singleton.ThreadTwo;

public class Main {
  public static void main(String[] args) {
    Human anna = new Human.HumanBuilder().firstName("Anna").lastName("Martynenko").age(19).build();
    System.out.println(anna);
    DTOSimple dataAccessObject = DTOSimple.getInstance();
    System.out.println(dataAccessObject);
    Thread threadFoo = new Thread(new ThreadOne());
    Thread threadBar = new Thread(new ThreadTwo());

    threadFoo.start();
    threadBar.start();
  }
}