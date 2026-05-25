package com.ar.arrays;

import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {22,12,29,31,30,12,29};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j] ) {
//                    System.out.println(arr[i]);
//                    break;
//                }
//            }
//        }

        System.out.println("Another way");
        Arrays.sort(arr);
        for (int i = 0; i<arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
