package org.example.strategy;

import java.math.BigDecimal;

public interface Operation {
    <T> BigDecimal process(T amount);
}
