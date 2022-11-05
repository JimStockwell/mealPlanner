package dev.jimstockwell.mealPlanner;

import java.util.stream.Stream;

public interface OrderHelper {
    Stream<OrderHelperRow> stream();
}
