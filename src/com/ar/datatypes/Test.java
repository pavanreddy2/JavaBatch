package com.ar.datatypes;

public class Test {

    //declared static variable
   static int i = 100; //static variable

    public static void main(String[] args) {
    //1) using className
        System.out.println(i);
        System.out.println("**************");
        //2) using new keyword
        //className refName = new className();
        Test param = new Test();
        System.out.println(param.i);
    }
}
