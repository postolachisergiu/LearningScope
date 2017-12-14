package com.javafortesters.chap011exceptions.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExceptionsExampleTest {

    @Test(expected = NullPointerException.class)
    public void throwANullPointerException(){
        Integer age=null;
        String ageAsString = age.toString();
        String yourAge =
                "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
    }


    @Test()
    public void throwANullPointerException1(){
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        }catch (NullPointerException e){
           e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
             age = 18;
            ageAsString = age.toString();
        }

        String yourAge =
                "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void tryCatchFinallyTest(){
        Integer age=null;
        String ageAsString;
        String yourAge="";
        try{
            ageAsString = age.toString();
        }catch(NullPointerException e) {
            age = 18;
            ageAsString = age.toString();

        }
        finally {
            yourAge = "You are " + age.toString() + " years old";
        }

        assertEquals("You are 18 years old", yourAge);
    }

    @Test(expected = IllegalArgumentException.class)
    public void exampleTryCatchFinnally(){
        Integer age = null;

        try {
            System.out.println("1. generate a null pointer exception");
            System.out.println(age.toString());
        }catch (NullPointerException e){
            System.out.println("2. handle null pointer exception");
            throw new IllegalArgumentException("Null pointer became Illegal", e);
        }finally {
            System.out.println("3. run code in finally section");
        }
    }
}
