package com.ar.transferstatements;

public class Example1 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            if (i == 3) { // false //false // true
                break;
            }
            System.out.println(i); // 1, 2
        }
    }
}
