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

//    public String numberOfWordsPerWord(String sentence) {
//        String[] wordArray =  sentence.split(" ") ;
//        Stream.to(wordArray)

//        int index = (wordArray.length) -1;
//        String finalString = "";
//        int duplicateCount = 0;
//        for (String word : wordArray) {
//            for (int n : wordArray[n])
//                if (word == ) {
//                duplicateCount +=1;
//            }
//            String result = "" + word + ":" + duplicateCount + " ";
//
//
//
//        }
//    }
}
