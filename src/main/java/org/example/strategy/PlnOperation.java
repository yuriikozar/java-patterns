package org.example.strategy;

public class PlnOperation {
    private static PlnOperation instance;

    private PlnOperation(){

    }
    public static PlnOperation getInstance() {
        return instance != null ? instance : new PlnOperation();
    }
}
