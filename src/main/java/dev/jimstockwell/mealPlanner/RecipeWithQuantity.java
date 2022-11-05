package dev.jimstockwell.mealPlanner;

import lombok.Getter;

import java.util.stream.Stream;

/**
 * Maintains a recipe along with how many copies are planned to be cooked in one go.
 */
@Getter
public class RecipeWithQuantity {
    private final Recipe recipe;
    private final double qty;

    public RecipeWithQuantity(Recipe recipe, double qty) {
        this.recipe = recipe;
        this.qty = qty;
    }

    public Stream<OrderHelperRow> multipliedOrderHelperRowStream() {
        throw new UnsupportedOperationException(); // TODO
    }
}