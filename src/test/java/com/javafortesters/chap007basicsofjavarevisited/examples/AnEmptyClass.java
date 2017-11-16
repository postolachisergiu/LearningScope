package com.javafortesters.chap007basicsofjavarevisited.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnEmptyClass {

    @Test
    public void variableNaming(){
        String $aString="bob";
        float £owed=10F;
        int aMount=4;
        long Amount=5;
        String A0123456789bCd$f="ugh";
        assertEquals(4,aMount);
        assertEquals(5, Amount);
        assertEquals(10.0F, £owed, 0);
        assertEquals("bob", $aString);
        assertEquals("ugh", A0123456789bCd$f);
    }

    @org.junit.Test
    public void nonImportTest(){
        org.junit.Assert.assertEquals(3, 2 + 1);
    }

    @Test
    public void BooleanType(){
        boolean truthy = true;
        boolean falsey = false;
        assertTrue(truthy);
        assertFalse(falsey);
        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;
        assertTrue(truthy);
        assertFalse(falsey);
    }


    @Test
    public void IntegerTypes(){
        byte aByteHas1Byte;
        int anIntHas4Bytes;
        long aLongHas8Bytes;
        System.out.println(
                "* `byte` range: " +
                        Byte.MIN_VALUE + " to " +
                        Byte.MAX_VALUE);
        System.out.println( "* `short` range: " +
                Short.MIN_VALUE + " to " +
                Short.MAX_VALUE);
        System.out.println( "* `int` range: " +
                Integer.MIN_VALUE + " to " +
                Integer.MAX_VALUE);
        System.out.println( "* `long` range: " +
                Long.MIN_VALUE + " to " +
                Long.MAX_VALUE);
        aLongHas8Bytes = 0L; //add suffix L for long
        assertEquals(0, aLongHas8Bytes);
        aByteHas1Byte = 0xA; //add prefix 0x for Hex
        assertEquals(10,aByteHas1Byte);
        anIntHas4Bytes = 010; //add 'zero' prefix for Octal
        assertEquals(8, anIntHas4Bytes);
        aByteHas1Byte = 0b0010; // Java 1.7 added 0b 'zero b' for binary
        assertEquals(aByteHas1Byte, 2);
// Java 1.7 allows underscores for readability
        aLongHas8Bytes = 9_000_000_000L; // 9 000 million
        assertEquals(9000000000L, aLongHas8Bytes);
    }


    @Test
    public void FloatingPointType(){
        float singlePrecision32bit;
        double doublePrecision64bit;
        System.out.println("* `float` range: " +
                Float.MIN_VALUE + " to " +
                Float.MAX_VALUE);
        System.out.println( "* `double` range: " +
                Double.MIN_VALUE + " to " +
                Double.MAX_VALUE);
        singlePrecision32bit = 10.0F; // suffix F to get a float
        assertEquals(10F, singlePrecision32bit, 0);
        doublePrecision64bit = 20.0; // default to double
        assertEquals(20D, doublePrecision64bit, 0);
    }

    /**
     *
     \t - a tab character
     \b - backspace
     \n - a new line
     \r - a carriage return
     \' - a single quote
     \" - a double quote
     \\ - a backslash
     */
    @Test
    public void CharacterType(){
        char aChar = '\u0026';
        assertEquals(aChar, '&');
    }


    /**
     *
     + for addition
     - for subtraction
     * for multiplication
     / for division
     + can also be used for String concatenation
     % for integer remainder calculations (i.e. modulus) e.g. 9%2 returns 1
     */
    @Test
    public void traditionalOperatorsExplored(){
        assertEquals(4, 2+2);
        assertEquals(5L, 10L - 5L);
        assertEquals(25.0F, 12.5F * 2F, 0);
        assertEquals(30.2D, 120.8D / 4D, 0);
        assertEquals("abcd", "ab" + "cd");
        assertEquals(1, 9%2);
    }


    @Test
    public void assignmentOperatorsExplored(){
        String ab = "ab";
        assertEquals("ab", ab);
        int num = 10;
        assertEquals(10, num);
        num += 2;
        assertEquals("+= increments by", 12, num);
        num -= 4;
        assertEquals("-= decrements by", 8, num);
        num *= 2;
        assertEquals("*= multiplies by", 16, num);
        num /= 4;
        assertEquals("*= multiplies by", 4, num);
        num %=3;
        assertEquals("%= modulus of", 1, num);
    }

    @Test
    public void incrementDecrementOperatorsExplored(){
        int num = 10;
        assertEquals(11, ++num);
        assertEquals(10, --num);
        assertEquals(10, num++);
        assertEquals(11, num);
        assertEquals(11, num--);
        assertEquals(10, num);
    }

    // ternary Operator
    @Test
    public void ternaryOperatorsExplored(){
        int x;
        x = 4>3 ? 2 : 1;
        assertEquals(2, x);
        assertTrue( 5>=4 ? true : false );
    }

    @Test
    public void stringsConcatenated(){
        assertEquals("123456", "12" + "34" + "56");
    }

    @Test
    public void someStrings(){
        String test = "785485965488dgfleltkotoe,geg,oerooe";

        String aString = "abcdef";

        System.out.println(test.length());
        assertEquals(6, aString.length());
        assertTrue(aString.compareToIgnoreCase("ABCDEF")==0);
        assertTrue(aString.contains("bcde"));
        assertTrue(aString.startsWith("abc"));
// string indexing starts at 0
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4));
    }
}
