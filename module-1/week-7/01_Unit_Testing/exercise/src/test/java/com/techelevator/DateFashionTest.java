package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {
    @Test
    public void testValidInputOne(){
        DateFashion dateFashion = new DateFashion();

        int testA = 5;
        int testB = 10;

        Assert.assertEquals(2,dateFashion.getATable(testA, testB));
    }
    @Test
    public void testValidInputTwo(){
        DateFashion dateFashion = new DateFashion();

        int testA = 5;
        int testB = 2;

        Assert.assertEquals(0,dateFashion.getATable(testA, testB));
    }
    @Test
    public void testValidInputThree(){
        DateFashion dateFashion = new DateFashion();

        int testA = 5;
        int testB = 5;

        Assert.assertEquals(1,dateFashion.getATable(testA, testB));
    }

    @Test
    public void testInvalidInput(){
        DateFashion dateFashion = new DateFashion();

        int testA = -2;
        int testB = 10;

        Assert.assertEquals(0,dateFashion.getATable(testA, testB));
    }
}
