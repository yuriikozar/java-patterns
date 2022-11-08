package org.example.strategy;

import java.math.BigDecimal;
import java.util.Objects;

public class UsdOperation implements Operation {
    private static UsdOperation instance;

    private UsdOperation() {

    }
    public static UsdOperation getInstance() {
        return Objects.requireNonNullElseGet(instance, UsdOperation::new);
    }

    @Override
    public <T> BigDecimal process(T amount) {
        return null;
    }
}
