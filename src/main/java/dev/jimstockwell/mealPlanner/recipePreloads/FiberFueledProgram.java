package dev.jimstockwell.mealPlanner.recipePreloads;

import dev.jimstockwell.mealPlanner.Qty;
import dev.jimstockwell.mealPlanner.Recipe;
import dev.jimstockwell.mealPlanner.StorageLimits;
import dev.jimstockwell.mealPlanner.iwq;

import static dev.jimstockwell.mealPlanner.recipePreloads.IngredientPreloads.*;
import static dev.jimstockwell.mealPlanner.recipePreloads.UomPreloads.*;

import java.time.Period;
import java.util.List;

public class FiberFueledProgram {
    private static final String REF = "Fiber Fueled program";
    public static final Recipe glutenFreePancakes = new Recipe(
            "Gluten-Free Pancakes", REF, new Qty("pancakes",6),
            List.of(new iwq(FLAXSEED_GROUND, TABLESPOON, 6),
                    new iwq(FLOUR_GLUTEN_FREE,CUP,1),
                    new iwq(BAKING_POWDER,TEASPOON,1),
                    new iwq(BAKING_SODA,TEASPOON,.25),
                    new iwq(SALT,TEASPOON,.25),
                    new iwq(ALMOND_MILK_UNSWEETENED, CUP,1),
                    new iwq(VINEGAR_APPLE_CIDER, TEASPOON,1),
                    new iwq(OIL_SUNFLOWER, TABLESPOON, 2),
                    new iwq(EXTRACT_VANILLA, TABLESPOON, 1)),
            null);
    public static final Recipe superchargedMisoSoup = new Recipe(
            "Supercharged Miso Soup", REF, new Qty("servings",2),
            List.of(new iwq(NOODLES_SOBA, OUNCE, 2),
                    new iwq(BIOME_BROTH,CUP,2),
                    new iwq(SEAWEED_WAKAME,TABLESPOON,1),
                    new iwq(MISO_PASTE_WHITE, CUP, .25),
                    new iwq(SPINACH_BABY_CHOPPED,CUP,.5),
                    new iwq(SCALLIONS_CHOPPED,CUP,.5),
                    new iwq(TOFU_FIRM_CUBED,CUP,.25),
                    new iwq(SHIITAKE_REHYDRATED,CUP,.25)),
            null);
    public static final Recipe fourBeanChili = new Recipe(
            "4-Bean Chili", REF, new Qty("servings",6),
            List.of(new iwq(OIL_OLIVE, TABLESPOON,1),
                    new iwq(ONION_WHITE_OR_YELLOW, WHOLE,1),
                    new iwq(PEPPER_BELL_YELLOW, WHOLE, 1),
                    new iwq(GARLIC,CLOVE,2),
                    new iwq(CHILI_POWDER, TABLESPOON,3),
                    new iwq(CUMIN_GROUND,TABLESPOON,1),
                    new iwq(OREGANO_DRIED,TEASPOON,2),
                    new iwq(BROTH_VEGETABLE,CUP,2),
                    new iwq(TOMATO_SAUCE,CUP,1),
                    new iwq(TOMATOES_DICED_CANNED,CAN_15_OZ,1),
                    new iwq(BEANS_BLACK_CANNED,CAN_15_OZ,1),
                    new iwq(BEANS_KIDNEY_CANNED,CAN_15_OZ,1),
                    new iwq(BEANS_PINTO_CANNED,CAN_15_OZ,1),
                    new iwq(BEANS_CANNELLINI_CANNED,CAN_15_OZ,1),
                    new iwq(SALT,TEASPOON,.25)), null);
    public static final Recipe biomeBroth = new Recipe(
            "Biome Broth", REF, new Qty("cups",8),
            List.of(new iwq(SEAWEED_KOMBU,PIECE,1),
                    new iwq(CARROTS_CHOPPED,CUP,1),
                    new iwq(CELERY_CHOPPED,CUP,1),
                    new iwq(SHIITAKE_DRIED,CUP,1/3.),
                    new iwq(GINGER_FRESH,INCH,1),
                    new iwq(NUTRITIONAL_YEAST,TABLESPOON,1),
                    new iwq(OIL_OLIVE,TABLESPOON,2),
                    new iwq(SOY_SAUCE,TABLESPOON,3),
                    new iwq(TURMERIC_GROUND, TEASPOON, .25)),
            new StorageLimits("refrigerated", Period.ofDays(2))
            );
    public static final Recipe superfoodSmoothieOrBowl = new Recipe(
            "Superfood Smoothie or Bowl", REF, new Qty("serving",1),
            List.of(new iwq(ALMOND_MILK_UNSWEETENED,CUP,1),
                    new iwq(HEMP_SEED, TABLESPOON, 2),
                    new iwq(SPINACH_LEAVES, CUP, .5),
                    new iwq(BROCCOLI_SPROUTS, HANDFUL_SMALL, 1),
                    new iwq(KIWI, WHOLE, 1),
                    new iwq(STRAWBERRIES,WHOLE,5),
                    new iwq(PEANUT_BUTTER,TABLESPOON,2),
                    new iwq(BANANA_FROZEN,WHOLE,.5),
                    new iwq(MAPLE_SYRUP,TEASPOON,1)),null);
    public static final Recipe nourishingBuddhaBowl = new Recipe(
            "Nourishing Buddha Bowl", REF, new Qty("serving",1),
            List.of(new iwq(TAHINI,CUP,.25),
                    new iwq(LEMON_JUICE,TABLESPOON,2),
                    new iwq(GARLIC,CLOVE,1),
                    new iwq(OIL_OLIVE, TABLESPOON,1),
                    new iwq(SALT,TEASPOON,.5),
                    new iwq(CHICKPEAS_COOKED,CUP,.5),
                    new iwq(GRAIN_COOKED,CUP,.5),
                    new iwq(VEGETABLES_ROASTED,CUP,.5)),null);
    public static final Recipe nothingFishySushiWraps = new Recipe(
            "Nothing Fishy Sushi Wraps", REF, new Qty("servings",4),
            List.of(new iwq(CASHEWS_RAW,CUP,.5),
                    new iwq(LIME_JUICE,TABLESPOON,1),
                    new iwq(SRIRACHA,TABLESPOON,1),
                    new iwq(MAPLE_SYRUP,TEASPOON,2),
                    new iwq(SOY_SAUCE,TEASPOON,2),
                    new iwq(SALT,TEASPOON,.5),
                    new iwq(RICE_STICKY_UNCOOKED,CUP,1.5),
                    new iwq(SOY_SAUCE,TEASPOON,2),
                    new iwq(TOASTED_SUSHI_NORI,SHEET,6),
                    new iwq(CUCUMBER,WHOLE,1),
                    new iwq(MANGO_RIPE,WHOLE,1),
                    new iwq(BAKED_TOFU_TERIYAKI_FLAVORED,OUNCE,8),
                    new iwq(AVOCADO_LARGE,WHOLE,1),
                    new iwq(SESAME_SEED,TO_TASTE,1)),null);
    public static final Recipe bananaBakedOatmeal = new Recipe(
            "Banana Baked Oatmeal", REF, new Qty("servings",4),
            List.of(new iwq(BANANA_LARGE,WHOLE,1),
                    new iwq(OATS_QUICK_COOKING,CUP, 1.5),
                    new iwq(FLAXSEED_GROUND,TABLESPOON,2),
                    new iwq(CINNAMON_GROUND,TEASPOON,.5),
                    new iwq(BAKING_POWDER,TEASPOON,1),
                    new iwq(SALT,TEASPOON,.25),
                    new iwq(MILK_DAIRY_FREE_UNSWEETENED,CUP,.75),
                    new iwq(MAPLE_SYRUP,CUP,1/3.),
                    new iwq(OIL_SUNFLOWER,TABLESPOON,2),
                    new iwq(EXTRACT_VANILLA,TEASPOON,1),
                    new iwq(WALNUT_CHOPPED,CUP,.25)),null);
    public static final Recipe chickpeaMeatballs = new Recipe(
            "Chickpea Meatballs", REF, new Qty("whole", 18),
            List.of(new iwq(FLAXSEED_GROUND,TABLESPOON,1.5),
                    new iwq(CHICKPEAS_COOKED,CUP,3),
                    new iwq(WALNUTS,CUP,.75),
                    new iwq(BREAD_CRUMBS,CUP,.75),
                    new iwq(OIL_OLIVE,TABLESPOON,5),
                    new iwq(OREGANO_DRIED,TEASPOON,1.5),
                    new iwq(BASIL_DRIED,TEASPOON,1.5),
                    new iwq(PARSLEY_DRIED,TEASPOON,1.5),
                    new iwq(SALT,TEASPOON,.75),
                    new iwq(BLACK_PEPPER_GROUND,TEASPOON,.25)),null);
    public static final Recipe chickpeaMeatballPastaMarinara = new Recipe(
            "Chickpea Meatball Pasta Marinara", REF, new Qty("serving",2),
            List.of(new iwq(PASTA_DRIED,OUNCE,7),
                    new iwq(MARINARA_SAUCE,CUP,2),
                    new iwq(CHICKPEA_MEATBALLS, WHOLE,6),
                    new iwq(PEPITA_PARMESAN,TO_TASTE,1)),null);
    public static final Recipe quickGarlicBroccoli = new Recipe(
            "Quick Garlic Broccoli", REF, new Qty("serving",2),
            List.of(new iwq(BROCCOLI_FLORETS,CUP,2),
                    new iwq(GARLIC,CLOVE,1),
                    new iwq(OIL_OLIVE,TEASPOON,1.5),
                    new iwq(SALT,TEASPOON,.25),
                    new iwq(BLACK_PEPPER_GROUND,TEASPOON,.25),
                    new iwq(MUSTARD_DRY,TEASPOON,.5)),null);
    public static final Recipe creamyChaiOats = new Recipe(
            "Creamy Chai Oats", REF, new Qty("serving",2),
            List.of(new iwq(CHAI_TEA_BAG, BAG,1),
                    new iwq(ALMOND_MILK_UNSWEETENED, CUP,1.5),
                    new iwq(CINNAMON_GROUND, TEASPOON,.5),
                    new iwq(CARDAMOM_GROUND,TEASPOON,.25),
                    new iwq(NUTMEG_GROUND, TEASPOON,.25),
                    new iwq(OATS_ROLLED,CUP,1),
                    new iwq(FLAXSEED_GROUND,TEASPOON,1),
                    new iwq(CHIA_SEED,TEASPOON,1),
                    new iwq(HEMP_SEED,TABLESPOON,1),
                    new iwq(BANANA,WHOLE,1),
                    new iwq(EXTRACT_VANILLA,TEASPOON,1),
                    new iwq(SALT,PINCH,1),
                    new iwq(MAPLE_SYRUP,TEASPOON,1)),null);
}
