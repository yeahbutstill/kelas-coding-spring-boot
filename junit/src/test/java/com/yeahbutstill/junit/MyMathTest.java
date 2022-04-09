package com.yeahbutstill.junit;

import org.junit.Assert;
import org.junit.Test;

public class MyMathTest {

    MyMath myMath = new MyMath();
    // MyMath.sum
    // 1,2,3 => 6
    @Test
    public void testSumWith3Numbers() {
        // Absence of failure is success
        // Check that the result is 26
        // check result == 26
        Assert.assertEquals(26, myMath.sum(new int[]{1, 2, 3}));
    }

    @Test
    public void testSumWith1Number() {
        Assert.assertEquals(21, myMath.sum(new int[]{1}));
    }
}
