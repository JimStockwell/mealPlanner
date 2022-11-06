package dev.jimstockwell.mealPlanner;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Period;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class RecipeTest {
    @Test void test() {
        // ARRANGE
        String title = "Zesty Lemon Chia Pudding";
        String reference = "Fiber Fueled: The Plant Based Gut Health Program";
        var listOfIngredientsWithQuantities = List.of(
                new iwq("almond milk, unsweetened", new Qty("cups", 1.0)),
                new iwq("lemon zest", new Qty("teaspoons", 1)),
                new iwq("lemon juice", new Qty("cups", .25)),
                new iwq("maple syrup", new Qty("tablespoons", 1.5)),
                new iwq("turmeric, ground", new Qty("teaspoons", .25)),
                new iwq("salt", new Qty("pinches", 1)),
                new iwq("chia seeds", new Qty("cups", .25)));

        Qty makes = new Qty("cups", 2);
        StorageLimits storageLimits = new StorageLimits("refrigerated", Period.ofDays(7));
        Recipe recipe = new Recipe(title, reference, makes, listOfIngredientsWithQuantities, storageLimits);

        // ACT
        List<OrderHelperRow> rows = recipe.stream().toList();

        // ASSERT
        assertEquals(7,rows.size());
        assertEquals(title, rows.get(0).recipeName());
        assertEquals(reference,rows.get(0).reference());

        assertEquals("almond milk, unsweetened", rows.get(0).ingredient());
        assertEquals("cups", rows.get(0).uom());
        assertEquals("lemon zest", rows.get(1).ingredient());

        assertEquals(makes, recipe.getServings());
        assertEquals(storageLimits, recipe.getStorageLimits());
    }
}
