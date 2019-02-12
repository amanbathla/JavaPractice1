package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {

    GuessNumber numObject;

    @Before
    public  void createObject(){
        numObject = new GuessNumber();
    }
    @After
    public void deleteObject(){
        numObject = null;
    }
    //Guess Number

    @Test
    public void guessNumberRight() {
        int i = 3;
        int j = numObject.GuessNumber(25);
        assertEquals(i,j);
    }

    @Test
    public void guessNumberWrong() {
        int i = 3;
        int j = numObject.GuessNumber(49);
        assertNotEquals(j,i);
    }

}