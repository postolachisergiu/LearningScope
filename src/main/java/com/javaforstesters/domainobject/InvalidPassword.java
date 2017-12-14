package com.javaforstesters.domainobject;

public class InvalidPassword extends Exception{
    public InvalidPassword(String message) {
        super(message);
    }
}
