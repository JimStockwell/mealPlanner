package dev.jimstockwell.mealPlanner;

import java.util.stream.Stream;

public interface OrderHelper {
    Stream<OrderHelperRow> stream();

    String getIngredient(int i);

    String getUom(int i);

    double getQty(int i);

    String getRecipe(int i);

    int getSize();
}
