package com.adithya.Week2_JUnit_Exercises;

	import org.junit.runner.RunWith;
	import org.junit.runners.Suite;

	// Define the test suite
	@RunWith(Suite.class)
	@Suite.SuiteClasses({
	    CalculatorTest.class,
	    AssertionsTest.class,
	    CalculatorAAATest.class
	})
	public class AllTests {
	    // This class remains empty. It is used only as a holder for the above annotations.
	}

