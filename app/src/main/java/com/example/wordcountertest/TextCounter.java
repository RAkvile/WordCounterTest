package com.example.wordcountertest;

public class TextCounter {
    public static int getCharsCount(String phrase){
        return phrase.length();
    }

    public static int getWordsCount(String phrase){
        String[] words = phrase.trim().split("\\s+");
        return words.length;
    }
}