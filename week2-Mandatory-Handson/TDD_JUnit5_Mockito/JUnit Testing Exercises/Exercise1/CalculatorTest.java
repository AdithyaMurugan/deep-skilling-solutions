package com.adithya.Week2_JUnit_Exercises;

import static org.junit.Assert.*;


import org.junit.Test;

public class CalculatorTest {

	@Test
    public void testAdditionPositive() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testSubtractionZero() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.subtract(5, 5));
    }

    @Test
    public void testMultiplicationNegative() {
        Calculator calc = new Calculator();
        assertEquals(-12, calc.multiply(-3, 4));
    }
}
