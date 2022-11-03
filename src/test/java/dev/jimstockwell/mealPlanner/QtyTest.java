package dev.jimstockwell.mealPlanner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QtyTest {
    @Test void test() {
        assertEquals(new Qty("cups",1), new Qty("cups",1));
        assertNotEquals(new Qty("cups",1), new Qty("not cups",1));
        assertNotEquals(new Qty("cups",1), new Qty("cups",2));
    }
}