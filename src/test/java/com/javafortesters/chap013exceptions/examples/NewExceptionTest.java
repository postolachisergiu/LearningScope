package com.javafortesters.chap013exceptions.examples;

import com.javaforstesters.domainobject.InvalidPassword;
import com.javafortesters.domainentities.User;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class NewExceptionTest {

    @Test
    public void canCreateDefaultUserWithoutHandlingException(){
        User aUser = new User();
        assertEquals("username", aUser.getUsername());
        assertEquals("password", aUser.getPassword());
    }

    @Ignore
    @Test
    public void haveToCatchIllegalPasswordForParamConstructor() throws InvalidPassword {
        User aUser = new User("me","wrong");
    }
}
