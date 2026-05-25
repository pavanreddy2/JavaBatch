package com.ar.arrays;

import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
        int[] a = {1,2,3,9,5,7,6,4,8};

        Arrays.sort(a); // [1,2,3,4,5,6,7,8,9]
        int i1 = a[a.length - 2]; //a[7]
        System.out.println(i1);
        System.out.println("***********");

    }
}
