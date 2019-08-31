package com.company;

public class ShortestString {
    String words;

    public ShortestString(String wordsToAnalyze) {
        words = wordsToAnalyze;
    }


    public int getShortestWordLength(){
        String[] wordArray = words.split(" ");
        int lengthShortestWord = 0;
        for (String word : wordArray) {
            if(lengthShortestWord == 0) {
                lengthShortestWord = word.length();
            }else{
                lengthShortestWord = Math.min(lengthShortestWord, word.length());
            }

        }
        return lengthShortestWord;
    }
}
