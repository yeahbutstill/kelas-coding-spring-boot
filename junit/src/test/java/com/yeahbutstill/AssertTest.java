package com.yeahbutstill;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AssertTest {

    @Test
    void testOtherAssert() {
        Assert.assertEquals(1, 1);
        boolean condn = true;
        Assert.assertEquals(true, condn);
        Assert.assertTrue(condn);
        Assert.assertFalse(condn);
    }
}
