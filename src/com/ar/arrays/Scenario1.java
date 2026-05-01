package com.ar.arrays;

public class Scenario1 {
    public static void main(String[] args) {
        int[] marks = {75, 80,90,60,85};
        //Use case:
        //1) find average marks
        int sum = 0;
        for (int i = 0; i<marks.length;i++) {
            sum = sum + marks[i];
        }
       double average =  sum / marks.length;
        System.out.println(average);
    }
}
