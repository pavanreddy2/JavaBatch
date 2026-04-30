package com.ar.defualtEx;

class Product {
    int i = 100;
    String productName = "Mobile";
}
public class ProductService {
    public static void main(String[] args) {

        Product product = new Product();
        System.out.println(product.i);
        System.out.println(product.productName);
    }
}
