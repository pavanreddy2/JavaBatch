package com.ar.operators;

public class PreIncrementAndDecrement {
    public static void main(String[] args) {
        int i = 1; //2 //3//4
        int result = i++ + i++ + i--;

        System.out.println(i); //4
        System.out.println(result); //1 + 2 + 3
    }

}
