package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JadenCaseTest {

    private static JadenCase testee;

    @BeforeAll
    static void setup(){
        testee = new JadenCase();
    }

    @Test
    void testToJadenCaseNull() {
        assertEquals(null, testee.toJadenCase(null));
    }


    @Test
    void testToJadenCaseEmptyString() {
        assertEquals(null, testee.toJadenCase(""));
    }

    @Test
    void testToJadenCaseOneWord(){
        assertEquals("Test", testee.toJadenCase("test"));
    }

    @Test
    void testToJadenCaseTwoWords(){
        assertEquals("Test Case", testee.toJadenCase("test case"));
    }

    @Test
    void testToJadenCaseFourWords(){
        assertEquals("Random Special Test Case", testee.toJadenCase("Random special test case"));
    }

    @Test
    void testToJadenCaseSpecialCaractiers(){
        assertEquals("We're Movin' Out?", testee.toJadenCase("we're movin' out?"));
    }


}