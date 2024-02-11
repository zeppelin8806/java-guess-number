package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
    @Test
    public void testValidInputOne(){
        MaxEnd3 maxEnd3 = new MaxEnd3();

        int[] input = {1,2,3};
        int[] expect = {3,3,3};

        Assert.assertArrayEquals(expect, maxEnd3.makeArray(input));
    }

    @Test
    public void testValidInputTwo(){
        MaxEnd3 maxEnd3 = new MaxEnd3();

        int[] input = {11, 5, 9};
        int[] expect = {11, 11, 11};

        Assert.assertArrayEquals(expect, maxEnd3.makeArray(input));
    }

    @Test
    public void testValidInputThree(){
        MaxEnd3 maxEnd3 = new MaxEnd3();

        int[] input = {2, 11, 3};
        int[] expect = {3, 3, 3};

        Assert.assertArrayEquals(expect, maxEnd3.makeArray(input));
    }
    @Test
    public void testInvalidInput(){
        MaxEnd3 maxEnd3 = new MaxEnd3();

        int[] input = {2, 3};
        int[] expect = {3, 3};

        Assert.assertArrayEquals(expect, maxEnd3.makeArray(input));
    }
}
