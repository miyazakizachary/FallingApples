package com.pluralsight.fruittest;

import com.pluralsight.fruit.Banana;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BananaTest {

    private Banana banana;

    @BeforeEach
    void setUp() {
        banana = new Banana();
    }

    @Test
    void getName() {
        Assertions.assertEquals("Banana", banana.getName());
    }

    @Test
    void getRollMultiplier() {
        Assertions.assertEquals(0, banana.getRollMultiplier());
    }
}