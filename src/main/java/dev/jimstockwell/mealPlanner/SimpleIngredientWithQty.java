package dev.jimstockwell.mealPlanner;

public class SimpleIngredientWithQty {
    private final String ingredient;
    private final Qty qty;

    public SimpleIngredientWithQty(String ingredient, Qty qty) {
        this.ingredient = ingredient;
        this.qty = qty;
    }

    public String getIngredient() {
        return ingredient;
    }

    public Qty getQty() {
        return qty;
    }
}
