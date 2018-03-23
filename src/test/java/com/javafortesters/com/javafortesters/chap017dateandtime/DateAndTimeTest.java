package com.javafortesters.com.javafortesters.chap017dateandtime;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DateAndTimeTest {


    @Test
    public void dateTest(){
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
    }

    @Test
    public void currentTimeMillis(){
        long startTime = System.currentTimeMillis();
        for(int x=0; x < 10; x++){
            System.out.println("Current Time " +
                    System.currentTimeMillis());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total Time " + (endTime - startTime));
    }

    @Test
    public void nanoTimeMillis(){
        long startTime = System.nanoTime();
        for(int x=0; x < 10; x++){
            System.out.println("Current Time " +
                    System.nanoTime());
        }
        long endTime = System.nanoTime();
        System.out.println("Total Time " + (endTime - startTime));
    }

    @Test
    public void dateTestSecond(){
        Date equivDate1 = new Date();
        Date equivDate2 = new Date(System.currentTimeMillis());
        System.out.println(equivDate1);
        System.out.println(equivDate2.toString());
    }

    @Test
    public void format(){
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/MM/yyyy");
        System.out.println(sdf.format(date));
        assertThat(sdf.format(date), is("22/03/2018"));
    }

    @Test
    public void sdf1() throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("y M d HH:mm:ss.SSS");
        Date date1 = sdf1.parse("2013 12 15 23:39:54.123");
        System.out.println(date1);
    }

    @Test
    public void calendarTest(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().getTime());
        System.out.println(calendar.getTimeZone().toString());
        System.out.println(calendar.getTime().toString());

        Calendar sameDate = Calendar.getInstance();

        sameDate.setTime(calendar.getTime());

        assertThat(calendar.equals(sameDate), is(true));
    }

    @Test
    public void oneWeek(){
        Calendar cal = Calendar.getInstance();
        Calendar oneWeekFromNow = Calendar.getInstance();
        oneWeekFromNow.setTime(cal.getTime());
        oneWeekFromNow.add(Calendar.DATE,7);

        assertThat(oneWeekFromNow.after(cal), is(true));
        assertThat(cal.before(oneWeekFromNow), is(true));
        assertThat(cal.compareTo(oneWeekFromNow), is(-1));
        assertThat(oneWeekFromNow.compareTo(cal), is(1));

    }


}
