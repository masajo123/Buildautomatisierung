package org.muellner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.IconUIResource;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    private BMICalculator bmiCalculator;

    @BeforeEach
    void setUp() {
        bmiCalculator = new BMICalculator(180,1.8);

    }

    @Test
    @DisplayName("Konstruktor Test")
    void testConstructor() {
        double expectedWeight = 180;
        Assertions.assertEquals(expectedWeight, bmiCalculator.getWeightInKg());
        Assertions.assertEquals(1.8, bmiCalculator.getHeightInMeter());
    }

    @org.junit.jupiter.api.Test
    void result() {
    }


}