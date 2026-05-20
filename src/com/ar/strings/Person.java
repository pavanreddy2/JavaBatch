package com.ar.strings;

public final class Person {

    private final int id;
    private final String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //Provide Getter Method

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
