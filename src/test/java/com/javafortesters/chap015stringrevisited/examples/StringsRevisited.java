package com.javafortesters.chap015stringrevisited.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringsRevisited {

    @Test
    public void stringTest(){
        String asString = "abcdefg";
        assertThat(asString.length(), is(7));

        System.out.println("Bob said \"hello\" to his cat's friend");
        System.out.println("This is a single backslash \\");
    }

    @Test
    public void convertingString(){
        String intConcatConvert = "" + 1;
        assertThat(intConcatConvert, is("1"));

        String integerStringConvert = String.valueOf(3);
        assertThat(integerStringConvert, is("3"));

        assertThat(Integer.valueOf("2"), is(2));
    }

    @Test
    public void comparingString(){
        String hello = "Hello";
        assertThat(hello.compareTo("Hello"), is(0));

        String empty = "";
        assertThat(empty.isEmpty(), is(true));
        assertThat(empty.length(), is(0));

        String hello1 = "Hello fella";
        assertThat(hello1.indexOf("l"), is(2));
    }

    @Test
    public void regularExpTest(){
        String mustIncludeADigit = ".*[0123456789]+.*";
        assertThat("123".matches(mustIncludeADigit), is(true));
    }

    @Test
    public void format(){
        int value = 4;
        String template = "The value %d was used";
        String formatted = String.format(template, value);
        assertThat(formatted, is("The value 4 was used"));

        String use = "%s %s towards %d large %s";
        assertThat(
                String.format(use, "Bob", "ran", 6, "onions" ),
                is("Bob ran towards 6 large onions"));
    }

    @Test
    public void split(){
        String csv="1,2,3,4,5,6,7,8,9,10";
        String[] results = csv.split(",");

        assertThat(results.length, is(10));
        assertThat(results[0], is("1"));
        assertThat(results[9], is("10"));
    }

    @Test
    public void stringBuilders(){
        StringBuilder builder = new StringBuilder();
        builder.append("Hello There").
                replace(7,11,"World").
                delete(5,7);
        assertThat(builder.toString(), is("HelloWorld"));
    }
}
