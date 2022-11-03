package dev.jimstockwell.mealPlanner;

import lombok.Getter;

@Getter
public class RecipeWithQuantity {
    private final Recipe recipe;
    private final double qty;

    public RecipeWithQuantity(Recipe recipe, double qty) {
        this.recipe = recipe;
        this.qty = qty;
    }
}