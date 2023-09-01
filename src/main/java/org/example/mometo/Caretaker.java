package org.example.mometo;

import java.util.HashMap;
import java.util.Map;

class Caretaker {
    private final Map<Long, Memento> mementos = new HashMap<>();
    private long versionCounter = 0;

    public long saveMemento(Memento memento) {
        long version = versionCounter++;
        mementos.put(version, memento);
        return version;
    }

    public Memento getMemento(long version) {
        return mementos.get(version);
    }
}