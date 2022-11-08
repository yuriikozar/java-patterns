package org.example.strategy;

public class CurrencyStrategy {
    public UsdOperation getOperation(Usd amount) {
        return UsdOperation.getInstance();
    }
    public EurOperation  getOperation(Eur amount) {
        return EurOperation.getInstance();
    }
    public PlnOperation getOperation(Pln amount) {
        return PlnOperation.getInstance();
    }
}
