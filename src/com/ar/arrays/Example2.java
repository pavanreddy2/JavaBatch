package com.ar.arrays;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int[] a = {10,20,30};
       //For loop
        for (int i = 0; i < a.length; i++) {
           a[i] = a[i] * 2;
        }
        System.out.println(Arrays.toString(a));
    }
}
