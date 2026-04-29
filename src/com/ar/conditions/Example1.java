package com.ar.conditions;

public class Example1 {
    public static void main(String[] args) {
        int a = 100, b = 100;
        if (a < b) {
            System.out.println("Biggest Number is: "+ b);
        } else if (a > b) {
            System.out.println("Biggest Number is: "+ a);
        } else {
            System.out.println("Both are equal");
        }
    }
}
