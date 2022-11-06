package dev.jimstockwell.mealPlanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RecipeWithQuantityTest {

    @InjectMocks RecipeWithQuantity recipeWithQuantity;
    @Mock Recipe recipe;
    @Mock Number number;

    @Test
    void oneLineRecipe() {
        // ARRANGE
        double measure = 2.0;
        double multiple = 3.0;
        when(recipe.stream()).thenReturn(
                Stream.of(new OrderHelperRow("ing1", "uom", measure, "recipe",
                        "ref", new Qty("servings",4)))
        );
        when(number.doubleValue()).thenReturn(multiple);

        // ACT
        OrderHelperRow[] rows = recipeWithQuantity.multipliedOrderHelperRowStream().toArray(OrderHelperRow[]::new);

        // ASSERT
        assertEquals(1, rows.length);
        assertEquals(measure*multiple, rows[0].measure(), .0001);
        assertEquals("ing1",rows[0].ingredient());
        assertEquals("recipe",rows[0].recipeName());
    }
}