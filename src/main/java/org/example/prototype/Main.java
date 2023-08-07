package org.example.prototype;

public class Main {
  public static void main(String[] args) {
    BobaFett bobaFett = new BobaFett();
    bobaFett.setChromosomes(46);
    bobaFett.setName("Bobba Fett");
    bobaFett.setIndividualNumber("000001");

    RegularClone clone = new RegularClone();
    clone.setChromosomes(46);
    clone.setIndividualNumber("CT-27-5555");

    BobaFett bobaFettClone = (BobaFett) bobaFett.clone();
    RegularClone fives = (RegularClone) clone.clone();
    System.out.println("We need clones to fight against separatists!!! \n ------------------\n");
    if (bobaFettClone != bobaFett && bobaFett.equals(bobaFettClone)) {
      System.out.println("Success! We have clone of Bobba Fett which is not the same object, bu is identical \n --------------- \n");
    }
    if (clone != fives && clone.equals(fives)) {
      System.out.println("Same with regular clones. Now we can strike back!!!");
    }
  }
}
