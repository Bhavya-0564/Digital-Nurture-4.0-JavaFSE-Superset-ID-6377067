package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        // Cleanup
        calculator = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(5, 3);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 4);

        // Assert
        assertEquals(6, result);
    }
}
