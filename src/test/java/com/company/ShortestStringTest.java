package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ShortestStringTest {

    @Test
    void testGetShortestWordLengthWithEmptyInputArray() {
        ShortestString testee = new ShortestString(" ");

        assertEquals(0, testee.getShortestWordLength());

    }

    @Test
    void testGetShortestWordLengthWithOneWord() {
        ShortestString testee = new ShortestString("test");

        assertEquals(4, testee.getShortestWordLength());
    }

    @Test
    void testGetShortestWordLengthWithThreeWords() {
        ShortestString testee = new ShortestString("test new clearing");

        assertEquals(3, testee.getShortestWordLength());
    }

    @Test
    void testGetShortestWordLengthWithNull(){
        ShortestString testee = new ShortestString(null);
        assertThrows(NullPointerException.class, testee::getShortestWordLength);
    }



}