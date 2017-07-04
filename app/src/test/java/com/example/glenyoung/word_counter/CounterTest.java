package com.example.glenyoung.word_counter;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 * Created by glenyoung on 04/07/2017.
 */

public class CounterTest {
    Counter counter;

    @Before
    public void before() {
        counter = new Counter();
    }

    @Test
    public void canGetNumberOfWords() {
        String sentence = "I am the greatest person ever";
        assertEquals(6, counter.numberOfWords(sentence));
    }
}
