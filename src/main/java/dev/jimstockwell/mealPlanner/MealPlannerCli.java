package dev.jimstockwell.mealPlanner;

import dev.jimstockwell.mealPlanner.recipePreloads.FiberFueledProgram;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MealPlannerCli implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        RecipePlan recipePlan =
                new RecipePlan(List.of(
                        new RecipeWithQuantity(FiberFueledProgram.glutenFreePancakes,1),
                        new RecipeWithQuantity(FiberFueledProgram.superchargedMisoSoup,1),
                        new RecipeWithQuantity(FiberFueledProgram.fourBeanChili,1)));

        OrderHelper orderHelper = new OrderHelperMaker().apply(recipePlan);

        OrderHelperRow[] rows =
                orderHelper.stream().toArray(OrderHelperRow[]::new);
        System.out.print(Arrays.toString(rows));
    }
}
