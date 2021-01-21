package com.skilsbus.onlineshop;

import product.Product;

import java.util.ArrayList;

public class ShopingCart implements Operation {

    private ArrayList<Product> products = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public void removeProduct(String productName ) {
        for (Product product:products
        ) {
            if (product.getName()==productName){
                products.remove(productName);

            }
            else System.out.println(" this product not found in your  Shopping Cart products");
        }
    }

    @Override
    public void printAllProducts() {

        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public double getTotalPrice() {
        double sum = 0;

        for (int i = 0; i < this.products.size(); i++) {
            sum += products.get(i).getPrice();
        }
        return sum;
    }

    public double getPriceAfterdiscout() {
        double sum = 0;


        for (Product product : products) {
            sum += product.getPrice() * (1 - product.getDiscount() / 100.0);
        }
        return sum;

    }



}
