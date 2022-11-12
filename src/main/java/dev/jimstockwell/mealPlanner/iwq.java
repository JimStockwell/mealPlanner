package dev.jimstockwell.mealPlanner;

import dev.jimstockwell.mealPlanner.recipePreloads.IngredientPreloads;
import dev.jimstockwell.mealPlanner.recipePreloads.UomPreloads;
import lombok.Builder;

@Builder
public class iwq {
    private final String ingredient;
    private final Qty qty;

    public iwq(String ingredient, Qty qty) {
        this.ingredient = ingredient;
        this.qty = qty;
    }
    public iwq(String ingredient, String uom, Number measure) {
        this.ingredient = ingredient;
        this.qty = new Qty(uom,measure.doubleValue());
    }

    public iwq(IngredientPreloads ingredient, UomPreloads uom, Number measure) {
        this.ingredient = ingredient.toString();
        this.qty = new Qty(uom.toString(),measure.doubleValue());
    }

    public String getIngredient() {
        return ingredient;
    }

    public Qty getQty() {
        return qty;
    }
}
