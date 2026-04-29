package com.ar.iterativeStatments;

public class NestedForLoop2 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j =i; j<=i; j++) {
                //Runs from 1 to i
                System.out.print(j * 2+ " ");
            }
            System.out.println();
        }
    }
}
