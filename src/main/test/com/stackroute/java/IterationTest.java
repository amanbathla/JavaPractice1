package com.stackroute.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IterationTest {

    Iteration numObject;

    @Before
    public  void createObject(){
        numObject = new Iteration();
    }
    @After
    public void deleteObject(){
        numObject = null;
    }
    @Test
    public void iterationSuccess() {
        String expected = "122333444455555";
        String Original = numObject.Iteration(5);
        assertEquals(expected,Original);

    }
    @Test
    public void iterationFailure() {
        String expected = "1223334444";
        String Original = numObject.Iteration(5);
        assertNotEquals(expected,Original);

    }


}