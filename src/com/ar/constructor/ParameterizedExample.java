package com.ar.constructor;

public class ParameterizedExample {
    int i ;
    //ParameterizedExample() {} //0 arg constructor

    //Parameterized Constructor
    ParameterizedExample(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        ParameterizedExample ex = new ParameterizedExample(10);
        System.out.println(ex.i);
    }
}
