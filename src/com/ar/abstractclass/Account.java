package com.ar.abstractclass;

public abstract class Account {

    //we have zero or more number of concrete methods & zero or more number of abstract methods.

    abstract void calculateInterest ();  //abstract method.

    //concrete method.
    void login () {
        System.out.println("Login successfully..");
    }
}