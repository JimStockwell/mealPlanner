package dev.jimstockwell.mealPlanner;

import java.util.function.Function;

public class OrderHelperMaker implements Function<RecipePlan,OrderHelper> {
    @Override
    public OrderHelper apply(RecipePlan recipePlan) {
        return new SimpleOrderHelper(recipePlan);
    }
}
