package dev.jimstockwell.mealPlanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SimpleOrderHelperTest {
    @InjectMocks SimpleOrderHelper simpleOrderHelper;
    @Mock RecipePlan recipePlan;

    @Test
    void basicallyAPassThrough() {
        // ARRANGE
        Stream<OrderHelperRow> stream = Stream.of();
        Mockito.when(recipePlan.streamMultipliedOrderHelperRows()).thenReturn(stream);

        // ACT
        OrderHelper orderHelper = new SimpleOrderHelper(recipePlan);

        // ASSERT
        assertEquals(stream,orderHelper.stream());
    }
}