package com.yeahbutstill.junit;

import org.junit.*;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @BeforeClass
    public static void testBeforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void testAfterClass() {
        System.out.println("After Class");
    }

    @Before
    public void testBefore() {
        System.out.println("Before");
    }

    @After
    public void testAfter() {
        System.out.println("After");
    }

    // MyMath.sum
    // 1,2,3 => 6
    @Test
    public void testSumWith3Numbers() {
        // Absence of failure is success
        // Check that the result is 26
        // check result == 26
        System.out.println("Test1");
        Assert.assertEquals(26, myMath.sum(new int[]{1, 2, 3}));
    }

    @Test
    public void testSumWith1Number() {
        System.out.println("Test2");
        Assert.assertEquals(21, myMath.sum(new int[]{1}));
    }
}
