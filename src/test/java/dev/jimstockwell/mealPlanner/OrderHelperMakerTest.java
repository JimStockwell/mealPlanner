package dev.jimstockwell.mealPlanner;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Period;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderHelperMakerTest {
    @Test
    @Disabled // this is our "acceptance test".  Keep it on hold while we make finer grain tests
    void test() {
        // ARRANGE
        final String title1 = "title1";
        final String reference1 = "reference1";
        var listOfIngredientsWithQuantities1 = List.of(
                new SimpleIngredientWithQty("ing1", new Qty("teaspoons", 1.1)),
                new SimpleIngredientWithQty("ing2", new Qty("cups", 1.2)));
        Qty makes1 = new Qty("cups", 1);
        StorageLimits storageLimits = new StorageLimits("refrigerated", Period.ofDays(7));
        Recipe recipe1 = new Recipe(title1, reference1, makes1, listOfIngredientsWithQuantities1, storageLimits);

        final String title2 = "title1";
        final String reference2 = "reference1";
        var listOfIngredientsWithQuantities2 = List.of(
                new SimpleIngredientWithQty("ing1", new Qty("cups", 2.1)),
                new SimpleIngredientWithQty("ing3", new Qty("cups", 2.2)));
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
        assertEquals(4,orderHelper.getSize());
        assertEquals("ing1", orderHelper.getIngredient(0));
        assertEquals("ing1", orderHelper.getIngredient(1));
        assertEquals("ing2", orderHelper.getIngredient(2));
        assertEquals("ing3", orderHelper.getIngredient(3));
        assertEquals("cups",orderHelper.getUom(0));
        assertEquals("teaspoons",orderHelper.getUom(1));
        assertEquals("cups",orderHelper.getUom(2));
        assertEquals("cups",orderHelper.getUom(3));
        assertEquals(2.1*2,orderHelper.getQty(0));
        assertEquals(1.1*1,orderHelper.getQty(1));
        assertEquals(1.2*1,orderHelper.getQty(2));
        assertEquals(2.2*2,orderHelper.getQty(3));
        assertEquals("recipe2", orderHelper.getRecipe(0));
        assertEquals("recipe1",orderHelper.getRecipe(1));
        assertEquals("recipe1",orderHelper.getRecipe(2));
        assertEquals("recipe2",orderHelper.getRecipe(3));
    }
}
