package com.adithya.Week2_JUnit_Exercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorAAATest {

    private CalculatorAAA calculator;
 // Setup method
    @Before
    public void setUp() {
        calculator = new CalculatorAAA();
        System.out.println("Setup complete");
    }
    // Teardown method
    @After
    public void tearDown() {
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // Arrange
        int a = 10, b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testMultiplication() {
        // Arrange
        int a = 4, b = 3;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        // Arrange
        int a = 20, b = 4;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(5, result);
    }

  
}