package com.company;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if (phrase != null && phrase.length() > 0)  {
            StringBuilder jadenPhrase = new StringBuilder();
            for (String word  : phrase.split(" ")) {
                jadenPhrase
                        .append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1))
                        .append(" ");
            }
            return jadenPhrase.toString().strip();
        }
        return null;
    }

}