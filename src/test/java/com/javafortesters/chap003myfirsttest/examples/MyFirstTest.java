package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyFirstTest {

    /*
     This code checks something.
     */
    @Test
    public void canAddTwoPlusTwo() {
        int answer = 2 + 2;
        //assertThat();
        assertEquals("2+2=4", 4, answer);
    }

    /**
    This code checks something.
     */
    @Test
    public void operationExOne() {
        int answer = 2 - 2;
        //assertThat();
        assertEquals("2-2=0", 0, answer);
    }

    //  This code checks something.
    @Test
    public void operationExTwo() {
        int answer = 4 / 2;
        //assertThat();
        assertEquals("4/2=2", 2, answer);
    }

    @Test
    public void operationExThree() {
        int answer = 2 * 2;
        //assertThat();
        assertEquals("2*2=4", 4, answer);
    }
}

