package com.ar.strings;

public class ImmutableClassEx {
    public static void main(String[] args) {
        Person person = new Person(101, "Pavan");
        System.out.println(person.getId());
        System.out.println(person.getName());

        //person.id = 200;//Compiler Issue.
      //  person.name = "Param";
        System.out.println(person.getId());
        System.out.println(person.getName());
    }
}
