package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LastNCharacterTest {


    LastNCharacter stringFunctions;

    @Before
    public  void createObject(){
        stringFunctions = new LastNCharacter();
    }
    @After
    public  void deleteObject(){
        stringFunctions = null;
    }





    //Print last N character

    @Test
    public void printLastNCharacterNtimesSuccess() {
        String expectedOutput = "amanmanmanman";
        String originalOutput  = stringFunctions.printLastNCharacterNtimes("aman",
                3);
        System.out.println(originalOutput);
        assertEquals(expectedOutput,originalOutput);
    }

    @Test
    public void printLastNCharacterNtimesFailure() {
        String expectedOutput = "amanamaamaama";
        String originalOutput  = stringFunctions.printLastNCharacterNtimes("aman",
                3);
        System.out.println(originalOutput);
        assertNotEquals(expectedOutput,originalOutput)
        ;
    }

}