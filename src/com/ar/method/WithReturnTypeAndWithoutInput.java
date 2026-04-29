package com.ar.method;

public class WithReturnTypeAndWithoutInput {
    public static int printMessage() {
       return 1000;
    }

    public static void main(String[] args){
        int result = printMessage();
        System.out.println(result);
    }
}
