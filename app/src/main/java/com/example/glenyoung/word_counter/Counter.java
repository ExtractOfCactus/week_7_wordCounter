package com.example.glenyoung.word_counter;

/**
 * Created by glenyoung on 04/07/2017.
 */

public class Counter {

    public Counter(){

    }

    public int numberOfWords(String sentence) {
        String[] wordArray =  sentence.split(" ") ;
        return wordArray.length;
    }
}
