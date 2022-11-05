package dev.jimstockwell.mealPlanner;

import java.util.List;
import java.util.stream.Stream;

public class Recipe {
    private final String title;
    private final String reference;
    private final Qty makes;
    // TODO: change this to a non-generic type? Say, IngredientsWithQty?
    private final List<SimpleIngredientWithQty> listOfIngredientsWithQuantities;
    private final StorageLimits storageLimits;

    public Recipe(String title,
                  String reference,
                  Qty makes,
                  List<SimpleIngredientWithQty> listOfIngredientsWithQuantities,
                  StorageLimits storageLimits) {
        this.title = title;
        this.reference = reference;
        this.makes = makes;
        this.listOfIngredientsWithQuantities = List.copyOf(listOfIngredientsWithQuantities);
        this.storageLimits = storageLimits;
    }

    public String getTitle() {
        return title;
    }

    public String getReference() {
        return reference;
    }

    public String getIngredientName(int i) {
        return listOfIngredientsWithQuantities.get(i).getIngredient();
    }

    public Qty getMakes() {
        return makes;
    }

    public StorageLimits getStorageLimits() {
        return storageLimits;
    }

    public Qty getIngredientQty(int i) {
        return listOfIngredientsWithQuantities.get(i).getQty();
    }

    public Stream<OrderHelperRow> stream() {
        return null; // TODO
    }
}
