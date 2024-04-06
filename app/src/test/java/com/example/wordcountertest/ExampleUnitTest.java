package com.example.wordcountertest;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Given_EmptyText_getCharsCount_ZeroReturned() {
        String givenString = " ";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_EmptyText_getWordsCount_ZeroReturned() {
        TextCounter TC = new TextCounter();

        String givenString = " ";

        int expectedValue = 0;
        int actualValue = TC.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_NullText_getCharsCount_ZeroReturned() {
        String givenString = null;

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_NullText_getWordsCount_ZeroReturned() {
        String givenString = null;

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }


    @Test
    public void Given_TextWithSpecialCharacters_getCharsCount_CorrectCountReturned() {
        String givenString = ",;;;;; ;; ;;;";

        int expectedValue = 11;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_TextWithSpecialCharacters_getWordsCount_CorrectCountReturned() {
        String givenString = ",;;;;; ;; ;;;";

        int expectedValue = 3;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_TextWithWords_getCharsCount_CorrectCountReturned() {
        String givenString = "Labas rytas";

        int expectedValue = 11;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_TextWithWords_getWordsCount_CorrectCountReturned() {
        String givenString = "Labas rytas";

        int expectedValue = 2; 
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_TextWithOnlySpacesAndTabs_getCharsCount_ZeroReturned() {
        String givenString = "    \t";

        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void Given_TextWithOnlySpacesAndTabs_getWordsCount_ZeroReturned() {
        String givenString = "    \t";

        int expectedValue = 0;
        int actualValue = TextCounter.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }


}