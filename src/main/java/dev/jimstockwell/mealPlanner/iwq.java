package dev.jimstockwell.mealPlanner;

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

    public String getIngredient() {
        return ingredient;
    }

    public Qty getQty() {
        return qty;
    }
}
