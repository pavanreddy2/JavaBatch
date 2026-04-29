package com.ar.conditions;

public class Example2 {
    public static void main(String[] args) {
        int a=100, b = 100, c = 200;
        if (a > b) {
            if (a < c) {
                System.out.println("a is biggest");
            }else {
                System.out.println("b is biggest");
            }
        } else if (b > c) {
            if (b > a){
                System.out.println("b is biggest");
            } else {
                System.out.println("a is biggest");
            }
        } else if (c > b) {
            if (c > a) {
                System.out.println("c is biggest");
            } else {
                System.out.println("b is biggest");
            }
        } else {
            System.out.println("a, b,c are equal..");
        }
     }
}
