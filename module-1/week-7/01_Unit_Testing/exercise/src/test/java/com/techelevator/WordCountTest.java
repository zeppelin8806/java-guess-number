package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    @Test
    public void testGetCountWithValidInput() {
        WordCount wordCount = new WordCount();
        String[] input = {"ba", "ba", "black", "sheep"};
        Map<String, Integer> result = wordCount.getCount(input);

        Assert.assertEquals(2, result.get("ba").intValue());
        Assert.assertEquals(1, result.get("black").intValue());
        Assert.assertEquals(1, result.get("sheep").intValue());
    }

    @Test
    public void testGetCountWithRepeatedWords() {
        WordCount wordCount = new WordCount();
        String[] input = {"a", "b", "a", "c", "b"};
        Map<String, Integer> result = wordCount.getCount(input);

        Assert.assertEquals(2, result.get("a").intValue());
        Assert.assertEquals(2, result.get("b").intValue());
        Assert.assertEquals(1, result.get("c").intValue());
    }

    @Test
    public void testGetCountWithEmptyArray() {
        WordCount wordCount = new WordCount();
        String[] input = {};
        Map<String, Integer> result = wordCount.getCount(input);

        Assert.assertEquals(0, result.size());
    }

    @Test
    public void testGetCountWithNullInput() {
        WordCount wordCount = new WordCount();
        Map<String, Integer> result = wordCount.getCount(null);

        Assert.assertEquals(0, result.size());
    }
}

