package dev.jimstockwell.mealPlanner;

import java.util.List;
import java.util.stream.Stream;

public class Recipe {
    private final String title;
    private final String reference;

    // This is Qty not Number because "2" could mean makes 2 servings, or
    // makes 2 cups, etc.
    private final Qty servings;
    private final List<iwq> listOfIngredientsWithQuantities;
    private final StorageLimits storageLimits;

    public Recipe(String title,
                  String reference,
                  Qty servings,
                  List<iwq> listOfIngredientsWithQuantities,
                  StorageLimits storageLimits) {
        this.title = title;
        this.reference = reference;
        this.servings = servings;
        this.listOfIngredientsWithQuantities = List.copyOf(listOfIngredientsWithQuantities);
        this.storageLimits = storageLimits;
    }

    public Qty getServings() {
        return servings;
    }

    public StorageLimits getStorageLimits() {
        return storageLimits;
    }

    public Stream<OrderHelperRow> stream() {
        return listOfIngredientsWithQuantities.stream().map(x->new OrderHelperRow(
                x.getIngredient(), x.getQty().uom(), x.getQty().measure(),title,
                reference, servings));
    }
}
