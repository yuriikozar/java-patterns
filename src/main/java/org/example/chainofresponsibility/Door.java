package org.example.chainofresponsibility;

public abstract class Door {
    private Door next;

    public static Door link(Door first, Door... chain) {
        Door head = first;
        for (Door nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(String key);

    protected boolean checkNext(String key) {
        if (next == null) {
            return true;
        }
        return next.check(key);
    }
}