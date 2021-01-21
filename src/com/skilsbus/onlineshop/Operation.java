package com.skilsbus.onlineshop;

import product.Product;

public interface Operation {

    public void addProduct(Product product);
    public void removeProduct(String productName);
    public void printAllProducts();

}