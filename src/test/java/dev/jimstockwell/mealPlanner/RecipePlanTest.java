package dev.jimstockwell.mealPlanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RecipePlanTest {
    @InjectMocks
    RecipePlan recipePlan;

    @Mock
    List<RecipeWithQuantity> recipeWithQuantityList;

    @Test
    void oneRecipe() {
        // ARRANGE
        RecipeWithQuantity mockedRecipeWithQuantity = Mockito.mock(RecipeWithQuantity.class);
        Stream<RecipeWithQuantity> streamOfOneRecipeWithQuantity = Stream.of(mockedRecipeWithQuantity);
        when(recipeWithQuantityList.stream()).thenReturn(streamOfOneRecipeWithQuantity);

        OrderHelperRow orderHelperRow = new OrderHelperRow("ing", "uom", 2.0, "recipe", "reference");
        Stream<OrderHelperRow> streamOfOneOrderHelperRow = Stream.of(orderHelperRow);
        when(mockedRecipeWithQuantity.multipliedOrderHelperRowStream()).thenReturn(streamOfOneOrderHelperRow);

        // ACT
        Stream<OrderHelperRow> totalStream = recipePlan.streamMultipliedOrderHelperRows();

        // ASSERT
        OrderHelperRow[] orderHelperRows = totalStream.toArray(OrderHelperRow[]::new);
        assertEquals(1, orderHelperRows.length);
        assertEquals("ing", orderHelperRows[0].ingredient());
        assertEquals("uom", orderHelperRows[0].uom());
        assertEquals(2.0, orderHelperRows[0].measure(), 0.0001);
        assertEquals("recipe", orderHelperRows[0].recipeName());
        assertEquals("reference", orderHelperRows[0].reference());
    }

    @Test
    void twoRecipes() {
        // ARRANGE
        RecipeWithQuantity mockedFirstRecipeWithQuantity = Mockito.mock(RecipeWithQuantity.class);
        RecipeWithQuantity mockedSecondRecipeWithQuantity = Mockito.mock(RecipeWithQuantity.class);
        Stream<RecipeWithQuantity> streamOfTwoRecipes = Stream.of(mockedFirstRecipeWithQuantity, mockedSecondRecipeWithQuantity);
        when(recipeWithQuantityList.stream()).thenReturn(streamOfTwoRecipes);

        when(mockedFirstRecipeWithQuantity.multipliedOrderHelperRowStream()).thenReturn(Stream.of(new OrderHelperRow("ing1", "uom", 2.0, "recipe", "reference")));
        when(mockedSecondRecipeWithQuantity.multipliedOrderHelperRowStream()).thenReturn(Stream.of(new OrderHelperRow("ing2", "uom", 2.0, "recipe", "reference")));

        // ACT
        Stream<OrderHelperRow> totalStream = recipePlan.streamMultipliedOrderHelperRows();

        // ASSERT
        OrderHelperRow[] orderHelperRows = totalStream.toArray(OrderHelperRow[]::new);
        assertEquals(2, orderHelperRows.length);
        assertEquals("ing1", orderHelperRows[0].ingredient());
        assertEquals("ing2", orderHelperRows[1].ingredient());
    }

}