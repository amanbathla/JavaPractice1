package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnspecifiedNumberTest {



    UnspecifiedNumber numObject;


    @Before
    public  void createObject(){
        numObject = new UnspecifiedNumber();
    }
    @After
    public void deleteObject(){
        numObject = null;
    }

    //Unspecified Input

    @Test
    public void unspecifiedInputfailure() {

        int expectedNumber = 65;
        int originalNumber = numObject.unspecifiedInput("1 22 3 41");
        assertNotEquals(expectedNumber,originalNumber);

    }
    @Test
    public void unspecifiedInputSucess() {
        int expectedNumber = 67;
        int originalNumber = numObject.unspecifiedInput("1 22 3 41");
        assertEquals(expectedNumber,originalNumber);

    }

}