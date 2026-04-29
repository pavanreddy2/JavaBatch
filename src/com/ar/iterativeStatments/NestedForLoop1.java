package com.ar.iterativeStatments;

public class NestedForLoop1 {
    public static void main(String[] args) {
        for (int i = 0 ; i <= 10; i++) {  //outer loop
            for (int j = 0; j<10; j++) { //inner loop
                System.out.println(i + " "+ j);
            }
        }
    }
}
