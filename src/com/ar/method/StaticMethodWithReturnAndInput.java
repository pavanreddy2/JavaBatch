package com.ar.method;

public class StaticMethodWithReturnAndInput {

    //Declared
    public static int add (int a, int b, int c) {
        int d = a + b + c;
        return d;
    }
    public static void main(String[] args) {
        int result = StaticMethodWithReturnAndInput.add(100, 20, 30);
        System.out.println(result);
    }
}
