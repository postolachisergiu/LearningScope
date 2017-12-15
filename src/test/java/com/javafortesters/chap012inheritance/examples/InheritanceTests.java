package com.javafortesters.chap012inheritance.examples;

import com.javafortesters.domainentities.Admin;
import com.javafortesters.domainentities.EmptyUser;
import com.javafortesters.domainentities.ReadOnly;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceTests {

    @Test
    public void emptyUserExampleTest(){
        EmptyUser emptyUser = new EmptyUser();
        assertEquals("username", emptyUser.getUsername());
        assertEquals("password", emptyUser.getPassword());
    }

    @Test
    public void aUserHasNormalPermissions(){
        User aUser = new User();
        assertEquals("Normal", aUser.getPermission());
    }

    @Test
    public void anAdminUserDefaultConstructor(){
        Admin admin = new Admin();
        assertEquals("adminuser", admin.getUsername());
        assertEquals("password", admin.getPassword());
        assertEquals("Elevated", admin.getPermission());
    }

    @Test
    public void anReadOnlyUserDefaultConstructor(){
        ReadOnly readOnly = new ReadOnly();
        assertEquals("username", readOnly.getUsername());
        assertEquals("password", readOnly.getPassword());
        assertEquals("ReadOnly", readOnly.getPermission());
    }
}
