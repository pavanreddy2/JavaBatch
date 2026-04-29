package com.ar.operators;

public class PostIncrementAndDecrement {
    public static void main(String[] args) {
        //Here Post increment operator, “++” is used,
        // which means the value ‘i’ is first assigned to j and then
        //‘i’ is increment by 1.

        int i = 100;
        int j = i++; //post increment

        System.out.println(i); //101
        System.out.println(j); //100//

        int k = j--; //
        System.out.println(k); //100
        System.out.println(j);
    }
}
