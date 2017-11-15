package com.javafortesters.chap005testswithownclasses.domainobject.example;

import static com.javaforstesters.domainobject.TestAppEnv.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically(){
        assertEquals("Returns Hard Coded URL",
                "http://192.123.0.3:67",
                getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){
        assertEquals("Just the Domain",
                "192.123.0.3",
                DOMAIN);
        assertEquals("Just the port",
                "67",
                PORT);
    }

}
