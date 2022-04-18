package com.pluralsight.toolboxtest;

import com.pluralsight.toolbox.MeasuringTape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeasuringTapeTest {
    @Test
    public void MeasuringTapeInstanceIsNotNull() {
        var measuringTape = MeasuringTape.createMeasuringTape();
        Assertions.assertNotNull(measuringTape);
    }
}
