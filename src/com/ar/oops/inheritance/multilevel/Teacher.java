package com.ar.oops.inheritance.multilevel;


import com.ar.oops.inheritance.multilevel1.Person;

public class Teacher extends Person {

    protected String subject;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void teach() {
        System.out.println(name + " teacher "+ subject);
    }


}
