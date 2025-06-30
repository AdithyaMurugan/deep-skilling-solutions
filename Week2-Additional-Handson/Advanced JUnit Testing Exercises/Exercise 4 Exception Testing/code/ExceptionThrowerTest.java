package com.adithya.Week2_JUnit_Exercises;
import org.junit.Test;
public class ExceptionThrowerTest {
	@Test(expected = IllegalArgumentException.class)
    public void testExceptionThrown() {
        ExceptionThrower obj = new ExceptionThrower();
        obj.throwException(); // This should throw the expected exception
    }
}
