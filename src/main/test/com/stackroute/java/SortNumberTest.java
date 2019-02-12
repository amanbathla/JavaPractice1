package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortNumberTest {

    SortNumber numObject;


    @Before
    public  void createObject(){
        numObject = new SortNumber();
    }
    @After
    public void deleteObject(){
        numObject = null;
    }


    //Sort Number Success

    @Test
    public void sortNUmberSucess() {
        String expectedValue = "True";
        String originalValue = numObject.SortNUmber(6665666);
        assertEquals(expectedValue,originalValue);
    }

    @Test
    public void sortNUmberFailure() {
        String expectedValue = "True";
        String originalValue = numObject.SortNUmber(1234);
        assertNotEquals(expectedValue,originalValue);
    }

}