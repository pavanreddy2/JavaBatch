package com.ar.operators;

public class TernaryEx {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        // boolean_expression ? value_if_true : value_if_false
        char result = (a > b) ? 'c' : 'b';
        System.out.println(result);
    }
}
