package dev.jimstockwell.mealPlanner;

import lombok.EqualsAndHashCode;

import java.time.Period;

@EqualsAndHashCode
public class StorageLimits {
    private final String storageCondition;
    private final Period period;

    public StorageLimits(String storageCondition, Period period) {
        this.storageCondition = storageCondition;
        this.period = period;
    }
}
