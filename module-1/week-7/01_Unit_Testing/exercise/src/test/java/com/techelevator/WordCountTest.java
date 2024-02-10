package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    @Test
    public void tests(){
        WordCount wordCount = new WordCount();

        Map<String, Integer> result = new HashMap<>();
        String[] word = {"a", "b", "a", "c", "b"};

        result = wordCount.getCount(word);

        Assert.assertEquals(("a":2, "b":2, "c":1), result);

    }
}
