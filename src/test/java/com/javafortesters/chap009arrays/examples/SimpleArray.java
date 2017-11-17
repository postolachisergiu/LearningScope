package com.javafortesters.chap009arrays.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

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
}
