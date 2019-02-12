package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsonentTest {


    CheckConsonent stringFunction;


    @Before
    public void createObject(){
    stringFunction = new CheckConsonent();
    }


    @After
    public void deleteObject(){
        stringFunction = null;
    }


    @Test
    public void checkVowelConsonentSuccess() {
        String expectedOutput = "Vowel";
        String originalOutput  = stringFunction.checkVowelConsonent("a");
        assertEquals(expectedOutput,originalOutput);
    }

    @Test
    public void checkVowelConsonentFailure() {
        String expectedOutput = "Vowel";
        String originalOutput  = stringFunction.checkVowelConsonent("n");
        assertNotEquals(expectedOutput,originalOutput);

    }

}