package com.ar.strings;

public class StringConstantPoolEx {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "ABC";

        //== Operator: is going to compare the reference value. if there are same then
        //it will return true value
        //If not same , it will return false.
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        //.eqauls method ==> compare the content of the String..
        //if there is same content it will return true.
        //if not it will return false.
        System.out.println(str1.equals(str2)); // true
        System.out.println(str2.equals(str3)); // false


    }
}
