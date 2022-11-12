package dev.jimstockwell.mealPlanner.recipePreloads;

public enum UomPreloads {
    TO_TASTE("to taste"),
    CLOVE("clove"),
    PINCH("pinch"),
    WHOLE("whole"),
    BAG("bag"),
    TABLESPOON("tablespoon"),
    TEASPOON("teaspoon"),
    CUP("cup"),
    CAN_15_OZ("15 oz can"),
    OUNCE("ounce"),
    INCH("inch"),
    HANDFUL_SMALL("small handful"),
    SHEET("sheet"),
    PIECE("piece");

    private final String displayName;
    UomPreloads(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
