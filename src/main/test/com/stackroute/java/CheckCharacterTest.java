package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckCharacterTest {

    CheckCharacter stringFunction;


    @Before
    public void createObject(){
        stringFunction = new CheckCharacter();
    }


    @After
    public void deleteObject(){
        stringFunction = null;
    }

    @Test
    public void checkCharacterSuccess() {
        String expectedOutput = "Capital Letter";
        String originalOutput  = stringFunction.checkCharacter('A');
        assertEquals(expectedOutput,originalOutput);
    }
    @Test
    public void checkCharacterFailure() {
        String expectedOutput = "Capital Letter";
        String originalOutput  = stringFunction.checkCharacter('a');
        assertNotEquals(expectedOutput,originalOutput);
    }


}