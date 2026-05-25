package com.ar.arrays;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[] prices = {100,200,300};
        for (int i = 0; i < prices.length; i++){
            prices[i] = prices[i] - 10;
        }
        System.out.println(Arrays.toString(prices));
    }
}
