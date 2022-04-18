package com.pluralsight.fruittest;

import com.pluralsight.fruit.Apple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppleTest {
    @Test
    public void AppleHasCorrectName() {
        Apple apple = new Apple();
        Assertions.assertEquals("Apple", apple.getName());
    }

    @Test
    public void AppleHasCorrectRollMultiplier() {
        var apple = new Apple();
        Assertions.assertEquals(10, apple.getRollMultiplier());
    }
}
