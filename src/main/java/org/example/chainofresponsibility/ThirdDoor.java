package org.example.chainofresponsibility;

public class ThirdDoor extends Door {
    public boolean check(String key) {
        if (key.equals("valid key")) {
            System.out.println("Your key is valid");
        }
        return checkNext(key);
    }
}