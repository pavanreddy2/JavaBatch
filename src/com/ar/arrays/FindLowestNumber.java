package com.ar.arrays;

public class FindLowestNumber {
    public static void main(String[] args) {
        int[] arr = {22,12,29,31,30};
        //take variable
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
