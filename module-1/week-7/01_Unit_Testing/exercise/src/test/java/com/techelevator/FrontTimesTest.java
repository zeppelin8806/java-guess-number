package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {
    @Test
    public void testValidInputOne(){
        FrontTimes frontTimes = new FrontTimes();

        String input = "Chocolate";
        int letters = 2;
        String result = "ChoCho";

        Assert.assertEquals(result, frontTimes.generateString(input, letters));
    }
    @Test
    public void testValidInputTwo(){
        FrontTimes frontTimes = new FrontTimes();

        String input = "Chocolate";
        int letters = 3;
        String result = "ChoChoCho";

        Assert.assertEquals(result, frontTimes.generateString(input, letters));
    }
    @Test
    public void testValidInputThree(){
        FrontTimes frontTimes = new FrontTimes();

        String input = "Abc";
        int letters = 3;
        String result = "AbcAbcAbc";

        Assert.assertEquals(result, frontTimes.generateString(input, letters));
    }
}
