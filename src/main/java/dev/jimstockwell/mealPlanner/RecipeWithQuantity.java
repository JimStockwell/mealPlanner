package dev.jimstockwell.mealPlanner;

import lombok.Getter;

import java.util.stream.Stream;

/**
 * Maintains a recipe along with how many copies are planned to be cooked in one go.
 */
@Getter
public class RecipeWithQuantity {
    private final Recipe recipe;
    private final Number number;

    public RecipeWithQuantity(Recipe recipe, Number number) {
        this.recipe = recipe;
        this.number = number;
    }

    public Stream<OrderHelperRow> multipliedOrderHelperRowStream() {
        return Stream.empty(); // TODO
//        return recipe.stream().map(x->new OrderHelperRow(x.ingredient(),
//                                                         x.uom(),
//                                                         x.measure()*number.doubleValue(),
//                                                         x.recipeName(),
//                                                         x.reference()));

    }
}