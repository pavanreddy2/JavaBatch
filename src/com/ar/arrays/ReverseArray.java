package com.ar.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {22,12,29,31,30};

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}
