package com.adithya.Week2_JUnit_Exercises;

public class PerformanceTester {
	public void performTask() {
        // Simulate a task that finishes within the timeout
        for (int i = 0; i < 100000; i++) {
            int square = i * i;
        }
    }

}
