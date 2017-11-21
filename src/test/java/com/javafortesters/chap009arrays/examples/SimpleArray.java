package com.javafortesters.chap009arrays.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SimpleArray {

    @Test
    public void simpleArrayExample(){
        String[] numbers0123 = {"zero", "one", "two", "three"};
        for (String numberText:numbers0123
             ) {
            System.out.println(numberText);
        }
        assertEquals("zero", numbers0123[0]);
        assertEquals("two", numbers0123[2]);
    }

    @Test
    public void testDays(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday"};

        for (String day: workdays
             ) {
            System.out.println(day +" has a length of " + day.length());
        }
        assertEquals("Monday", workdays[0]);
        assertEquals("Friday", workdays[4]);
    }


    @Test
    public void userTests(){
        User user1 = new User("user1", "user1");
        User user2 = new User("user2", "user2");
        User user3 = new User("user3", "user3");

        ArrayList <User> users = new ArrayList<>();
        users.add(user1);
        users.add(user3);
        users.add(user2);

        for (User user: users
             ) {
            System.out.println(user.getUsername());
        }
     }

     @Test
    public void createTestUsers(){
        ArrayList <User> users = new ArrayList<>();
        for(int i=1; i<=100; i++){
           User user = new User("user" + i, "password"+i);
           users.add(user);
        }
         for (User user: users
                 ) {
             System.out.println("Credentials are: " + user.getUsername()+ " and " + user.getPassword());
         }
     }


     /*
     using copyOf and copyOfRange Arrays methods
      */
    @Test
    public void testDaysCopy(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday"};

        String [] weekdays;
        weekdays = Arrays.copyOf(workdays,7);
        assertEquals(null, weekdays[5]);

        String [] weekdays1 = Arrays.copyOfRange(workdays, 2, 5);
        assertEquals("Friday", weekdays1[2]);
        System.out.println(weekdays1[2]);
    }

    /*
    using Arrays.fill()
     */
    @Test
    public void testFillArray(){
        int [] minusOne = new int[30];
        Arrays.fill(minusOne, -1);
        System.out.println(minusOne.length);


        int[] tenItems = {0,0,0,0,0,1,1,1,1,1};
        Arrays.fill(tenItems,5,10,2);
        System.out.println(tenItems[5]);
        System.out.println(tenItems[9]);

    }

    @Test
    public void testSortArray(){
        int [] outOfOrder = {2,4,3,1,5,0};

         Arrays.sort(outOfOrder);

        for (int u:outOfOrder
             ) {
            System.out.println(u);
        }

        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);
        for (String j:workdays
                ) {
            System.out.println(j);
        }

    }

    @Test
    public void testCreateATriangle(){
        createTriangle(10);
        createTriangleInt(8);
    }

    private void createTriangle(int height){
        for (String i="#"; i.length()<=height; i+="#"){
            System.out.println(i);
        }
    }

    private void createTriangleInt(int height){
        for (int i=0; i<=height; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j + ",");
            }
            System.out.println();
        }
    }
}
