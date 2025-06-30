package com.adithya.Week2_JUnit_Exercises;

import org.junit.Test;

public class PerformanceTesterTest {

    @Test(timeout = 1000) // test will fail if it takes more than 1000 ms
    public void testPerformTaskTimeout() {
        PerformanceTester tester = new PerformanceTester();
        tester.performTask();
    }
}