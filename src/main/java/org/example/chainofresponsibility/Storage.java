package org.example.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    private final List<String> dataBase = new ArrayList<>();
    private Door door;

    public void setDoors(Door middleware) {
        this.door = middleware;
    }


    public boolean enterTheRoom(String key) {
        if (door.check(key)) {
            System.out.println("Success!");
            return true;
        }
        return false;
    }

    public void add(String key) {
        dataBase.add(key);
    }

    public boolean isKeyPresent(String key) {
        return dataBase.contains(key);
    }
}