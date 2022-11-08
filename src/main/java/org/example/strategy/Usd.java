package org.example.strategy;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class Usd {
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Eur.class.getSimpleName() + "[", "]")
                .add("amount=" + amount)
                .toString();
    }
}
