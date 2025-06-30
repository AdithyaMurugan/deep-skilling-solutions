package com.adithya.Week2_JUnit_Exercises;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)  // Order by method name
public class OrderedTests {

    @Test
    public void test1_Login() {
        System.out.println("Login Test");
        assertTrue(true);
    }

    @Test
    public void test2_AddToCart() {
        System.out.println("Add To Cart Test");
        assertTrue(true);
    }

    @Test
    public void test3_Checkout() {
        System.out.println("Checkout Test");
        assertTrue(true);
    }
}