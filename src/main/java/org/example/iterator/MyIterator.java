package org.example.iterator;

public interface MyIterator {
    boolean hasNext();

    Page getNext();

    void reset();
}
