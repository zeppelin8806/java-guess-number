package com.techelevator;

import com.techelevator.Lucky13;
import org.junit.Assert;
import org.junit.Test;

public class Luck13Test {
    @Test
    public void testValidInput(){
        Lucky13 lucky13 = new Lucky13();

        int[] input = {0,2,4};

        Assert.assertTrue(lucky13.getLucky(input));
    }
    @Test
    public void testInvalidInputOne(){
        Lucky13 lucky13 = new Lucky13();

        int[] input = {1,2,3};

        Assert.assertFalse(lucky13.getLucky(input));
    }
    @Test
    public void testInvalidInputTwo(){
        Lucky13 lucky13 = new Lucky13();

        int[] input = {1,2,4};

        Assert.assertFalse(lucky13.getLucky(input));
    }
}
