package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    @Test
    public void testTheLengthOneorMore(){
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] input = new int[0];

        Assert.assertFalse(sameFirstLast.isItTheSame(input));
    }

    @Test
    public void testValidInput(){
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] input = {1, 2, 3, 1};

        Assert.assertTrue(sameFirstLast.isItTheSame(input));
    }

    @Test
    public void testValidInputTwo(){
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] input = {1, 2, 1};

        Assert.assertTrue(sameFirstLast.isItTheSame(input));
    }

    @Test
    public void testInvalidInput(){
        SameFirstLast sameFirstLast = new SameFirstLast();
        int[] input = {1, 2, 3};

        Assert.assertFalse(sameFirstLast.isItTheSame(input));
    }
}
