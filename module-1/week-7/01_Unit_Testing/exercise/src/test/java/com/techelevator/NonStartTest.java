package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {
    @Test
    public void testValid(){
        NonStart nonStart = new NonStart();

        String inputA = "Hello";
        String inputB = "There";

        Assert.assertEquals("ellohere", nonStart.getPartialString(inputA, inputB));
    }
    @Test
    public void testValidTwo(){
        NonStart nonStart = new NonStart();

        String inputA = "java";
        String inputB = "code";

        Assert.assertEquals("avaode", nonStart.getPartialString(inputA, inputB));
    }
    @Test
    public void testValidNullA(){
        NonStart nonStart = new NonStart();

        String inputA = "";
        String inputB = "There";

        Assert.assertEquals("here", nonStart.getPartialString(inputA, inputB));
    }

    @Test
    public void testValidNullB(){
        NonStart nonStart = new NonStart();

        String inputA = "Coding";
        String inputB = "";

        Assert.assertEquals("oding", nonStart.getPartialString(inputA, inputB));
    }
    @Test
    public void testValidNullAB(){
        NonStart nonStart = new NonStart();

        String inputA = "";
        String inputB = "";

        Assert.assertEquals("", nonStart.getPartialString(inputA, inputB));
    }
}
