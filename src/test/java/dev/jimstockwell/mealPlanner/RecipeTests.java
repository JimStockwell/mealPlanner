package dev.jimstockwell.mealPlanner;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


import java.time.Period;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class RecipeTests {
    @Test void test() {
        // ARRANGE
        String title = "Zesty Lemon Chia Pudding";
        String reference = "Fiber Fueled: The Plant Based Gut Health Program";
        var listOfIngredientsWithQuantities = List.of(
                new SimpleIngredientWithQty("almond milk, unsweetened", new Qty("cups", 1)),
                new SimpleIngredientWithQty("lemon zest", new Qty("teaspoons", 1)),
                new SimpleIngredientWithQty("lemon juice", new Qty("cups", .25)),
                new SimpleIngredientWithQty("maple syrup", new Qty("tablespoons", 1.5)),
                new SimpleIngredientWithQty("turmeric, ground", new Qty("teaspoons", .25)),
                new SimpleIngredientWithQty("salt", new Qty("pinches", 1)),
                new SimpleIngredientWithQty("chia seeds", new Qty("cups", .25)));

        Qty makes = new Qty("cups", 2);
        StorageLimits storageLimits = new StorageLimits("refrigerated", Period.ofDays(7));

        // ACT
        Recipe recipe = new Recipe(title, reference, makes, listOfIngredientsWithQuantities, storageLimits);

        // ASSERT
        assertEquals(title, recipe.getTitle());
        assertEquals(reference, recipe.getReference());

        assertEquals("almond milk, unsweetened", recipe.getIngredientName(0));
        assertEquals(new Qty("teaspoons", 1), recipe.getIngredientQty(0));
        assertEquals("lemon zest", recipe.getIngredientName(1));

        assertEquals(makes, recipe.getMakes());
        assertEquals(storageLimits, recipe.getStorageLimits());
    }
}
