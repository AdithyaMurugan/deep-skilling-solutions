package com.adithya.Week2_JUnit_Exercises;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

	@RunWith(Parameterized.class)
	public class EvenCheckerTest {

	    private int input;
	    private boolean expected;

	    public EvenCheckerTest(int input, boolean expected) {
	        this.input = input;
	        this.expected = expected;
	    }

	    @Parameterized.Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {
	            { 2, true },
	            { 3, false },
	            { 4, true },
	            { 5, false },
	            { 10, true }
	        });
	    }

	    @Test
	    public void testIsEven() {
	        EvenChecker checker = new EvenChecker();
	        assertEquals(expected, checker.isEven(input));
	    }
	}

