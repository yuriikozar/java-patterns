package org.example.chainofresponsibility;

public class SecondDoor extends Door {
    private final Storage storage;

    public SecondDoor(Storage storage) {
        this.storage = storage;
    }

    public boolean check(String key) {
        if (!storage.isKeyPresent(key)) {
            System.out.println("The key isn't valid");
            return false;
        }
        return checkNext(key);
    }
}