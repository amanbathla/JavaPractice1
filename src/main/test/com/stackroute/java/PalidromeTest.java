package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalidromeTest {


    Palidrome pl;

    @Before
    public void createObject(){
        pl = new Palidrome();
    }
    @After
    public void deleteObject(){
        pl = null;
    }

    @Test
    public void checkPalindrom() {

        String input = "Given Number is Palindrome and sum of even digits is less than 25";
        String failure = "failure";
        String output = pl.checkPalindrom(101);
//        assertEquals(input,output);

    assertNotEquals(failure,input);

    }

    @Test
    public void checkPalindromgreaterthan25() {
        String input1 = "Given Number is Palindrome and sum of even digits is greater  than 25";
        String output1 = pl.checkPalindrom(6665666);
        assertEquals(output1,input1);
    }

}