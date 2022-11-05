package dev.jimstockwell.mealPlanner;

import java.util.stream.Stream;

public class SimpleOrderHelper implements OrderHelper {
    private final RecipePlan recipePlan;

    public SimpleOrderHelper(RecipePlan recipePlan) {
        this.recipePlan = recipePlan;
    }

    @Override
    public Stream<OrderHelperRow> stream() {
        return recipePlan.streamMultipliedOrderHelperRows();
    }
}
