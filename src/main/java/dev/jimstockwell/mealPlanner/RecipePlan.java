package dev.jimstockwell.mealPlanner;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class RecipePlan {
    private final Comparator<OrderHelperRow> comparator =
            Comparator.comparing(OrderHelperRow::ingredient).thenComparing(OrderHelperRow::uom);
    private final List<RecipeWithQuantity> recipeWithQuantityList;

    public RecipePlan(List<RecipeWithQuantity> recipeWithQuantityList) {
        // TODO: defensive copy
        this.recipeWithQuantityList = recipeWithQuantityList;
    }

    public Stream<OrderHelperRow> streamMultipliedOrderHelperRows() {
        return recipeWithQuantityList.stream().flatMap(RecipeWithQuantity::multipliedOrderHelperRowStream).sorted(comparator);
    }
}
