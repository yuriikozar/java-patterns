package org.example.chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Storage storage;

    private static void initialization() {
        storage = new Storage();
        storage.add("valid key");
        storage.add("invalid key");
        Door doors = Door.link(
            new FirstDoor(2),
            new SecondDoor(storage),
            new ThirdDoor()
        );

        storage.setDoors(doors);
    }

    public static void main(String[] args) throws IOException {
        initialization();
        boolean success;
        do {
            System.out.print("Please, enter the key: ");
            String key = reader.readLine();
            success = storage.enterTheRoom(key);
        } while (!success);
    }
}