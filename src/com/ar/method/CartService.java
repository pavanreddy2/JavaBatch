package com.ar.method;

public class CartService {

    public static void addToCard(String productName, int quantity){
        System.out.println(productName+ " added with quantity "+ quantity);
    }

    public void add(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        addToCard("IPhone", 2);
        CartService cartService = new CartService();
        cartService.add(100);

    }
}
