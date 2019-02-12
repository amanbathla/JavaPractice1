package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString stringFunction;


    @Before
    public void createObject(){
        stringFunction = new ReverseString();
    }


    @After
    public void deleteObject(){
        stringFunction = null;
    }

    @Test
    public void checkCharacterSuccess() {
        String expectedOutput = "nama";
        String originalOutput  = stringFunction.reverseString("aman");
        assertEquals(expectedOutput,originalOutput);
    }
    @Test
    public void checkCharacterFailure() {
        String expectedOutput = "aman";
        String originalOutput  = stringFunction.reverseString("aman");
        assertNotEquals(expectedOutput,originalOutput);
    }


}