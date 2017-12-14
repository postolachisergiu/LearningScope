package com.javafortesters.domainentities;

public class Admin extends User {

    public Admin(String username, String password) {
        super(username,password);
    }
    public Admin(){
        this("adminuser", "password");
    }

    @Override
    public String getPermission(){
        return "Elevated";
    }
}
