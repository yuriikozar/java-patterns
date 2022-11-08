package org.example.strategy;

import java.util.Objects;

public class EurOperation {
    private static EurOperation instance;

    private EurOperation() {

    }

    public static EurOperation getInstance() {
        return Objects.requireNonNullElseGet(instance, EurOperation::new);
    }
}
