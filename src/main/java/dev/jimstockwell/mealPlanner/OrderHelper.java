package dev.jimstockwell.mealPlanner;

public interface OrderHelper {
    String getIngredient(int i);

    String getUom(int i);

    double getQty(int i);

    String getRecipe(int i);

    int getSize();
}
