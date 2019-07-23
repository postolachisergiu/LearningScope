package com.exam;

abstract class Person {
    private String name;

    public void displayName() {
        System.out.println("abstract");
    }

    final void sing() {
        System.out.println("sing");
    }
}
