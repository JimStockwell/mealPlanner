package dev.jimstockwell.mealPlanner;

import dev.jimstockwell.mealPlanner.recipePreloads.FiberFueledProgram;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static dev.jimstockwell.mealPlanner.recipePreloads.FiberFueledProgram.*;

@Component
public class MealPlannerCli implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        RecipePlan recipePlan =
                new RecipePlan(List.of(
                        // Week 4, day 1
                        new RecipeWithQuantity(biomeBroth,1),
                        new RecipeWithQuantity(glutenFreePancakes,1),
                        new RecipeWithQuantity(superchargedMisoSoup,1),
                        new RecipeWithQuantity(fourBeanChili,1),

                        // Week 4, day 2
                        new RecipeWithQuantity(superfoodSmoothieOrBowl,1),
                        new RecipeWithQuantity(nourishingBuddhaBowl,2),
                        new RecipeWithQuantity(nothingFishySushiWraps,1), //
                        // for day 3 lunch too

                        // Week 4, day 3
                        new RecipeWithQuantity(bananaBakedOatmeal,1), //
                        // leftovers for day 5
                        new RecipeWithQuantity(chickpeaMeatballs,1),
                        new RecipeWithQuantity(chickpeaMeatballPastaMarinara,
                                1),
                        new RecipeWithQuantity(quickGarlicBroccoli,1)));


        OrderHelper orderHelper = new OrderHelperMaker().apply(recipePlan);

        String result =
                orderHelper.stream().map(OrderHelperRow::toString).collect(
                        Collectors.joining("\n"));
        System.out.print(result);
    }

}
