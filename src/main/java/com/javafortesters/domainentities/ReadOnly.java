package com.javafortesters.domainentities;

public class ReadOnly extends User {

    @Override
    public String getPermission(){
        return "ReadOnly";
    }
}
