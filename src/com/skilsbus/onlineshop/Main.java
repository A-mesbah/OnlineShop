package com.skilsbus.onlineshop;

import product.Product;
import product.SoftProduct;

public class Main {
    public static void main(String[] args) {
        Product product0 = new SoftProduct("windows", "software", 10, 2, 1, 15) {
        };
        Visitor visitor = new Visitor("ahmed ", "ahmed@123");
        visitor.getShopingCart().addProduct(product0);
        Website website = new Website();
        website.addVisitor("Ahmed","ajhjb");
    }
}
