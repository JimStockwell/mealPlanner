package dev.jimstockwell.mealPlanner.recipePreloads;

import dev.jimstockwell.mealPlanner.Qty;
import dev.jimstockwell.mealPlanner.Recipe;
import dev.jimstockwell.mealPlanner.iwq;
import static dev.jimstockwell.mealPlanner.recipePreloads.IngredientConstants.*;

import java.util.List;

public class FiberFueledProgram {
    private static final String REF = "Fiber Fueled program";
    public static final Recipe glutenFreePancakes = new Recipe(
            "Gluten-Free Pancakes", REF, new Qty("pancakes",6),
            List.of(new iwq(FLAXSEED_GROUND, "tablespoon", 6),
                    new iwq(FLOUR_GLUTEN_FREE,"cup",1),
                    new iwq(BAKING_POWDER,"teaspoon",1),
                    new iwq(BAKING_SODA,"teaspoon",.25),
                    new iwq(SALT,"teaspoon",.25),
                    new iwq(ALMOND_MILK_UNSWEETENED, "cup",1),
                    new iwq(VINEGAR_APPLE_CIDER, "teaspoon",1),
                    new iwq(OIL_SUNFLOWER, "tablespoon", 2),
                    new iwq(EXTRACT_VANILLA, "tablespoon", 1)),
            null);
    public static final Recipe superchargedMisoSoup = new Recipe(
            "Supercharged Miso Soup", REF, new Qty("servings",2),
            List.of(new iwq(NOODLES_SOBA, "ounces", 2),
                    new iwq(BIOME_BROTH,"cup",2),
                    new iwq(SEAWEED_WAKAME,"tablespoon",11),
                    new iwq(MISO_PASTE_WHITE, "cup", .25),
                    new iwq(SPINACH_BABY_CHOPPED,"cup",.5),
                    new iwq(SCALLIONS_CHOPPED,"cup",.5),
                    new iwq(TOFU_FIRM_CUBED,"cup",.25),
                    new iwq(SHIITAKE_REHYDRATED,"cup",.25)),
            null);
    public static final Recipe fourBeanChili = new Recipe(
            "4-Bean Chili", REF, new Qty("servings",6),
            List.of(new iwq(OIL_OLIVE, "tablespoon",1),
                    new iwq(ONION_WHITE_OR_YELLOW, "whole",1),
                    new iwq(PEPPER_BELL_YELLOW, "whole", 1),
                    new iwq(GARLIC,"clove",2),
                    new iwq(CHILI_POWDER, "tablespoon",3),
                    new iwq(CUMIN_GROUND,"tablespoon",1),
                    new iwq(OREGANO_DRIED,"teaspoon",2),
                    new iwq(BROTH_VEGETABLE,"cup",2),
                    new iwq(TOMATO_SAUCE,"cup",1),
                    new iwq(TOMATOES_DICED_CANNED,"15 oz can",1),
                    new iwq(BEANS_BLACK_CANNED,"15 oz can",1),
                    new iwq(BEANS_KIDNEY_CANNED,"15 oz can",1),
                    new iwq(BEANS_PINTO_CANNED,"15 oz can",1),
                    new iwq(BEANS_CANNELLINI_CANNED,"15 oz can",1),
                    new iwq(SALT,"teaspoon",.25)), null);
}
