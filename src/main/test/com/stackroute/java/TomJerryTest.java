package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

    TomJerry stringFunction;


    @Before
    public void createObject(){
        stringFunction = new TomJerry();
    }


    @After
    public void deleteObject(){
        stringFunction = null;
    }
    //Check for Tom And Jerry
    @Test
    public void checkTomJerrySuccess() {
        String expectedOutput = "Tom";
        String originalOutput  = stringFunction.checkTomJerry(21);
        assertEquals(expectedOutput,originalOutput);
    }

    @Test
    public void checkTomJerryFailure() {
        String expectedOutput = "Tom";
        String originalOutput  = stringFunction.checkTomJerry(24);
        assertNotEquals(expectedOutput,originalOutput);
    }
}