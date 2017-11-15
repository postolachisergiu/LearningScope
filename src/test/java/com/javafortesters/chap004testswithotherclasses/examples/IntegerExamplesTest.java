package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntegerExamplesTest {

    @Test
    public void integerExploration() {

    }

    @Test
    public void toHexString(){
        System.out.println(convertIntToHex(10));
    }

    @Test
    public void maxMinCheck(){
        assertEquals(-2147483648, Integer.MIN_VALUE);
        assertEquals(2147483647, Integer.MAX_VALUE);

    }

    public String convertIntToHex(int x){
        return Integer.toHexString(x);
    }
}
