package dev.jimstockwell.mealPlanner;

import org.junit.jupiter.api.Test;

import java.time.Period;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderHelperMakerTest {
    @Test
//    @Disabled // this is our "acceptance test".  Keep it on hold while we make finer grain tests
    void test() {
        // ARRANGE
        final String title1 = "title1";
        final String reference1 = "reference1";
        var listOfIngredientsWithQuantities1 = List.of(
                new iwq("ing1", new Qty("teaspoons", 1.1)),
                new iwq("ing2", new Qty("cups", 1.2)));
        Qty makes1 = new Qty("cups", 1);
        StorageLimits storageLimits = new StorageLimits("refrigerated", Period.ofDays(7));
        Recipe recipe1 = new Recipe(title1, reference1, makes1, listOfIngredientsWithQuantities1, storageLimits);

        final String title2 = "title2";
        final String reference2 = "reference2";
        var listOfIngredientsWithQuantities2 = List.of(
                new iwq("ing1", new Qty("cups", 2.1)),
                new iwq("ing3", new Qty("cups", 2.2)));
        Qty makes2 = new Qty("cups", 1);
        Recipe recipe2 = new Recipe(title2, reference2, makes2, listOfIngredientsWithQuantities2, storageLimits);

        List<RecipeWithQuantity> recipeWithQuantityList=List.of(
                new RecipeWithQuantity(recipe1,1),
                new RecipeWithQuantity(recipe2,2)
        );
        RecipePlan recipePlan = new RecipePlan(recipeWithQuantityList);

        // ACT
        OrderHelper orderHelper = new OrderHelperMaker().apply(recipePlan);

        // ASSERT
        OrderHelperRow[] rows =
                orderHelper.stream().toArray(OrderHelperRow[]::new);
        assertEquals(4,rows.length);
        assertEquals("ing1", rows[0].ingredient());
        assertEquals("ing1", rows[1].ingredient());
        assertEquals("ing2", rows[2].ingredient());
        assertEquals("ing3", rows[3].ingredient());
        assertEquals("cups",rows[0].uom());
        assertEquals("teaspoons",rows[1].uom());
        assertEquals("cups",rows[2].uom());
        assertEquals("cups",rows[3].uom());
        assertEquals(2.1*2,rows[0].measure(),.0001);
        assertEquals(1.1*1,rows[1].measure(),.0001);
        assertEquals(1.2*1,rows[2].measure(),.0001);
        assertEquals(2.2*2,rows[3].measure(),.0001);
        assertEquals("title2", rows[0].recipeName());
        assertEquals("title1",rows[1].recipeName());
        assertEquals("title1",rows[2].recipeName());
        assertEquals("title2",rows[3].recipeName());
    }
}
