package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    @Test
    public void testing_Hello(){
        StringBits stringBits = new StringBits();
        String result = stringBits.getBits("Hello");
        Assert.assertEquals("Hlo", result);

    }
    @Test
    public void testing_GoodBye(){
        StringBits stringBits = new StringBits();
        String result = stringBits.getBits("Good Bye");
        Assert.assertEquals("Go y", result);

    }
    @Test
    public void testing_Tomorrow(){
        StringBits stringBits = new StringBits();
        String result = stringBits.getBits("Tomorrow");
        Assert.assertEquals("Tmro", result);

    }

}
