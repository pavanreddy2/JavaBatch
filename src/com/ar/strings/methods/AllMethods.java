package com.ar.strings.methods;


import java.util.Arrays;

public class AllMethods {
    public static void main(String[] args) {

        //.equalsIgnoreCase: perform the case-sensitive comparison between two Strings.
        //toUpperCase(): it can be used to convert all lowerCase letter to uppercase.
        //toLowerCase():
        //startWith: It will check whether the String start with Specified String or not, if the String starts with specified String, then startsWith () method will return true value otherwise it will return false.
        // endsWith:
        //Contains: It will check whether the String contains specified String or not. If yes, it will return true value, otherwise it will return false value.
        //charAt:
        //replace:
        //replaceFirst:
        //indexOf: it used to return value where the first occurance of the specified character ASCII value
        //lastIndexOf
        //subString: it able to return subString from the string strats from the specified StartIndex.
        //split: it split the given string into number of pieces in the form of String array. where
                // splitting will be performed on the specis of the specified delimiter.
        //toCharArray: used to convert data from String type to equalent char[] type.
        //trim: it can be used to remove before and after space of the String.
        //concat: it will add the specified string value of the String object.
        String str = "ar";
        String str1 = str.concat(" Institute");
        String str2 = str1.concat(" of Technologies");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("*********************");
        //StringBuilder
        StringBuilder sb1 = new StringBuilder("ar");
        StringBuilder sb2 =  sb1.append(" institute");
        StringBuilder sb3 =  sb2.append(" of technologies");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);


    }
}
