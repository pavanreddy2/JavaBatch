package com.ar.stringBufferOrBuilder;

public class Methods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ar institute ");
       StringBuilder result =  sb.deleteCharAt(3);
        System.out.println(result);
    }
}
