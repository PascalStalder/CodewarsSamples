package com.company;

import static org.junit.jupiter.api.Assertions.*;

class ShortestStringTest {

    @org.junit.jupiter.api.Test
    void testGetShortestWordLengthWithEmptyInputArray() {
        ShortestString testee = new ShortestString(" ");

        assertEquals(0, testee.getShortestWordLength());

    }

    @org.junit.jupiter.api.Test
    void testGetShortestWordLengthWithOneWord() {
        ShortestString testee = new ShortestString("test");

        assertEquals(4, testee.getShortestWordLength());
    }

    @org.junit.jupiter.api.Test
    void testGetShortestWordLengthWithThreeWords() {
        ShortestString testee = new ShortestString("test new clearing");

        assertEquals(3, testee.getShortestWordLength());
    }



}