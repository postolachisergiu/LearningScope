package com.javafortesters.chap010collections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

    @Test
    public void clearCollection(){
        List<String> workdays = new ArrayList<>();
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");

        List<String> daysOfWeek = new ArrayList<>();

        daysOfWeek.addAll(workdays);

        daysOfWeek.clear();

        assertEquals(0, daysOfWeek.size());
        assertTrue(daysOfWeek.isEmpty());

        daysOfWeek.add("Sunday");
        daysOfWeek.removeAll(workdays);
        assertTrue(daysOfWeek.size()==1);

        Object [] daysOfWeekArray = daysOfWeek.toArray();
        assertEquals(1, daysOfWeekArray.length);
    }

    @Test
    public void collectionOfUsers(){
        List<User> userList = new ArrayList<>();
        assertTrue(userList.size()==0);

        User user1 = new User("userA", "passA");
        User user2 = new User("userB", "passB");

        userList.add(user1);
        userList.add(user2);

        assertEquals(2, userList.size());


        List<User> userList2 = new ArrayList<>();

        User user3 = new User("userC", "passC");
        User user4 = new User("userD", "passD");
        userList2.add(user3);
        userList2.add(user4);

        userList.addAll(userList2);
        assertTrue(userList.containsAll(userList2));

        userList2.removeAll(userList2);
        assertTrue(userList2.size()==0);

        userList.clear();
        assertEquals(0, userList.size());
    }

    @Test
    public void usingSetCollection(){

        Set workdays = new HashSet();
        workdays.add("Monday");
        workdays.add("Tuesday");
        workdays.add("Wednesday");
        workdays.add("Thursday");
        workdays.add("Friday");
        workdays.add("Friday");
        workdays.add("Friday");

        assertEquals(5, workdays.size());
    }


    @Test
    public void collectionOfUsersSet() {
        Set setUsers = new HashSet();
        User user1 = new User("userA", "passA");
        User user2 = new User("userB", "passB");

        setUsers.add(user1);
        setUsers.add(user1);
        setUsers.add(user2);

        assertTrue(setUsers.size()==2);
    }


    @Test
    public void collectionMap(){

        Map<String, User> mapUser = new HashMap<>();

        User user1 = new User("userA", "passA");
        User user2 = new User("userB", "passB");

        mapUser.put("user1", user1);
        mapUser.put("user2", user2);

        assertEquals(2, mapUser.size());

        assertEquals(user1, mapUser.get("user1"));
        assertEquals(null, mapUser.get("user3"));

        assertTrue(mapUser.containsKey("user1"));
        assertFalse(mapUser.containsKey("user6"));
        assertTrue(mapUser.containsValue(user2));

        Set<String> keys = mapUser.keySet();
        keys.size();
        assertTrue(keys.size()==2);

        Set<Map.Entry<String, User>> entries = mapUser.entrySet();

        for (Map.Entry<String,User> entry:entries
             ) {
            System.out.println(entry);
        }


    }
}
