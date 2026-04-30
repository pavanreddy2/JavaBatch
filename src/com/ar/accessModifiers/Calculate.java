package com.ar.accessModifiers;

public class Calculate {
    private int add(int a, int b){
        return a+b;
    }

    public void display() {
       int result = add(10,10);
        System.out.println(result);
    }
}
