package com.javafortesters.chap010collections.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Collections {


    @Test
    public void simpleCollectionExample(){
        String [] numbers0123Array = {"zero", "one", "two", "three"};
        List<String> numbers0123 = Arrays.asList(numbers0123Array);

        for (String textNumber:numbers0123
             ) {
            System.out.println(textNumber);
        }
        assertEquals("zero", numbers0123.get(0));
    }

    @Test
    public void dynamicList(){
        List<String> numbers0123 = new ArrayList<>();

        numbers0123.add("0");
        numbers0123.add("1");
        numbers0123.add("2");
        numbers0123.add("3");

        for (String no: numbers0123
             ) {
            System.out.println(no);
        }

        assertEquals("1", numbers0123.get(1));
    }

    @Test
    public void endLoopForEach(){

        String[] someDays = {"Tuesday","Thursday",
                "Wednesday","Monday",
                "Saturday","Sunday",
                "Friday"};
        List<String> days = Arrays.asList(someDays);

        int forCount = 0;
        for (String day: days
             ) {
            if (day.equals("Monday")){
                break;
            }
            forCount++;
        }

        assertEquals("Monday is at position " + forCount ,3, forCount);

        int loopCount;
        for(loopCount=0; loopCount <= days.size(); loopCount++ ){
            if(days.get(loopCount).equals("Sunday")){
                break;
            }
        }
        assertEquals("Sunday is at position ", 5, loopCount);


        int count=0;
        while(!days.get(count).equals("Monday") ){
            count++;
        }
        assertEquals("Monday is at position 3", 3, count);

        int docount=-1;
        do{
            docount++;
        }while(!days.get(docount).equals("Monday"));
        assertEquals("Monday is at position 3", 3, docount);
    }

    @Test
    public void otherCollection(){
        List<String> workdays = new ArrayList<>();

        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");
        assertEquals(5, workdays.size());

        List<String> daysOfWeek = new ArrayList<>();

        daysOfWeek.addAll(workdays);
        assertEquals(workdays.size(),daysOfWeek.size());
        assertTrue( daysOfWeek.containsAll(workdays ));

        for (String day: daysOfWeek
             ) {
            System.out.println(day);
        }
    }
}
