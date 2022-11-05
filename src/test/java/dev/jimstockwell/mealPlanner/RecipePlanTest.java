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
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
    @Test
    void sorted() {
        // ARRANGE
        RecipeWithQuantity mockedFirstRecipeWithQuantity = Mockito.mock(RecipeWithQuantity.class);
        RecipeWithQuantity mockedSecondRecipeWithQuantity = Mockito.mock(RecipeWithQuantity.class);
        Stream<RecipeWithQuantity> streamOfTwoRecipes = Stream.of(mockedFirstRecipeWithQuantity, mockedSecondRecipeWithQuantity);
        when(recipeWithQuantityList.stream()).thenReturn(streamOfTwoRecipes);

        OrderHelperRow[] row = {
                new OrderHelperRow("ing1", "uom1", 2.0, "recipe", "ref"),
                new OrderHelperRow("ing1", "uom2", 2.0, "recipe", "ref"),
                new OrderHelperRow("ing2", "uom1", 2.0, "recipe", "ref"),
                new OrderHelperRow("ing2", "uom2", 2.0, "recipe", "ref")};

        when(mockedFirstRecipeWithQuantity.multipliedOrderHelperRowStream()).thenReturn(Stream.of(row[3], row[2]));
        when(mockedSecondRecipeWithQuantity.multipliedOrderHelperRowStream()).thenReturn(Stream.of(row[1], row[0]));

        // ACT
        Stream<OrderHelperRow> totalStream = recipePlan.streamMultipliedOrderHelperRows();

        // ASSERT
        OrderHelperRow[] orderHelperRows = totalStream.toArray(OrderHelperRow[]::new);
        assertEquals(4, orderHelperRows.length);
        assertEquals(row[0],orderHelperRows[0]);
        assertEquals(row[1],orderHelperRows[1]);
        assertEquals(row[2],orderHelperRows[2]);
        assertEquals(row[3],orderHelperRows[3]);
        assertNotEquals(row[0],row[3]); // just to make sure equals works
    }

}