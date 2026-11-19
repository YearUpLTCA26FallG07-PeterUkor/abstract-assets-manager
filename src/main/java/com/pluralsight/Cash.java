package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cash extends Asset {
    BigDecimal totalCash;

    public Cash(String description, String dateAcquired, BigDecimal originalCost, BigDecimal totalCash) {
        super(description, dateAcquired, originalCost);
        this.totalCash = totalCash;
    }

    public BigDecimal getTotalCash() {
        return totalCash.setScale(2, RoundingMode.HALF_UP);
    }

    public void setTotalCash(BigDecimal totalCash) {
        this.totalCash = totalCash;
    }

    public void addTotalCash(BigDecimal moreCash) {
        this.totalCash = this.totalCash.add(moreCash);
    }

    @Override
    public BigDecimal getValue() {
        return totalCash;
    }
}
