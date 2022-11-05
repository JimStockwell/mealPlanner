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

    @Override
    public String getIngredient(int i) {
        return null;
    }

    @Override
    public String getUom(int i) {
        return null;
    }

    @Override
    public double getQty(int i) {
        return 0;
    }

    @Override
    public String getRecipe(int i) {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
