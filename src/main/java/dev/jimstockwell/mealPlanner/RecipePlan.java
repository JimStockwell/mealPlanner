package dev.jimstockwell.mealPlanner;

import java.util.List;

public class RecipePlan {
    private final List<RecipeWithQuantity> recipeWithQuantityList;

    public RecipePlan(List<RecipeWithQuantity> recipeWithQuantityList) {
        this.recipeWithQuantityList = recipeWithQuantityList;
    }
}
