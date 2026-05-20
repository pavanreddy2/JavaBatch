package com.ar.arrays;

public class FindEvenNumber {
    public static void main(String[] args) {
        int[] arr = {22,12,29,31,30};
        //for Each
        for (int a: arr) {
            if (a % 2 == 0) {
                System.out.println("Even :" + a);
            }
        }
    }
}
