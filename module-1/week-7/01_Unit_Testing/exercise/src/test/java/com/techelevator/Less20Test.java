package com.techelevator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Less20Test {
    @Test
    public void testIsLessThanMultipleOf20WithOneLess() {
        Less20 less20 = new Less20();
        Assert.assertTrue(less20.isLessThanMultipleOf20(18));
        Assert.assertTrue(less20.isLessThanMultipleOf20(38));
    }

    @Test
    public void testIsLessThanMultipleOf20WithTwoLess() {
        Less20 less20 = new Less20();
        Assert.assertTrue(less20.isLessThanMultipleOf20(19));
        Assert.assertTrue(less20.isLessThanMultipleOf20(39));
    }

    @Test
    public void testIsNotLessThanMultipleOf20() {
        Less20 less20 = new Less20();
        Assert.assertFalse(less20.isLessThanMultipleOf20(20));
        Assert.assertFalse(less20.isLessThanMultipleOf20(40));
    }
}
