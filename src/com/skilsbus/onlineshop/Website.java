package com.skilsbus.onlineshop;

import product.Product;

import java.util.ArrayList;

public class Website implements Operation {
    private ArrayList<Visitor> visitors = new ArrayList<>();
    private ArrayList<Product> websiteProducts = new ArrayList<>();

    public Website() {
    }

    public void addVisitor(String name, String email) {
        Visitor visitor = new Visitor(name, email);
        visitors.add(visitor);
    }

    @Override
    public void addProduct(Product product) {
        websiteProducts.add(product);
    }

    @Override
    public void removeProduct(String productName) {
        for (Product product : websiteProducts
        ) {
            if (product.getName() == productName) {
                websiteProducts.remove(productName);

            } else System.out.println(" this product not found in your website products");
        }
    }

    public Product searchProductName(String productName) {
        for (int i = 0; i < websiteProducts.size(); i++) {
            if (websiteProducts.get(i).getName() == productName) {
                return websiteProducts.get(i);
            } else {
                System.out.println("Product not found ");
            }
        }
        return null;
    }

    public Product searchProductPrice(double productPrice) {
        for (int i = 0; i < websiteProducts.size(); i++) {
            if (websiteProducts.get(i).getPrice() == productPrice) {
                return websiteProducts.get(i);

            } else {
                System.out.println("Product not found ");
            }
        }
        return null;
    }

    public ArrayList<Visitor> getVisitors() {
        return visitors;
    }

    public void setVisitors(ArrayList<Visitor> visitors) {
        this.visitors = visitors;
    }

    public ArrayList<Product> getWebsiteProducts() {
        return websiteProducts;
    }

    public void setWebsiteProducts(ArrayList<Product> websiteProducts) {
        this.websiteProducts = websiteProducts;
    }

    public void printAllProducts() {

        for (Product product : websiteProducts) {
            System.out.println(product.toString());
        }
    }
}