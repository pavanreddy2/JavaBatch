package com.ar.variable;

public class InstanceVariableEx {
    //declaring the non static variable
    boolean flag = true;

    char ch = 'a'; // Non static or instance

    static int i= 100; //Static variable
    public static void main(String[] args) {

        //Accesing the variable
        //One way ==> using new keyword
        //className refName = new className();
        InstanceVariableEx ex = new InstanceVariableEx();
        System.out.println(ex.flag);

        System.out.println(ex.ch);
        System.out.println(InstanceVariableEx.i);
    }
}
