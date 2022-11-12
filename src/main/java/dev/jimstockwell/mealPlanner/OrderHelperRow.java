package dev.jimstockwell.mealPlanner;

public record OrderHelperRow(String ingredient, String uom, double measure,
                             String recipeName, String reference,
                             Qty makes) {
    public String toString() {
        var stringBuilder = new StringBuilder();
        stringBuilder.append(ingredient);
        stringBuilder.append(", ");
        stringBuilder.append(measure);
        stringBuilder.append(" ");
        stringBuilder.append(uom);
        stringBuilder.append(" - ");
        stringBuilder.append(recipeName);
        stringBuilder.append(", ");
        stringBuilder.append(reference);
        stringBuilder.append(" - makes ");
        stringBuilder.append(makes.measure());
        stringBuilder.append(" ");
        stringBuilder.append(makes.uom());
        return stringBuilder.toString();
    }
}
