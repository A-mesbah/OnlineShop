package com.skilsbus.onlineshop;

public class Visitor {
    private String name;
    private String emailAdress;
    private ShopingCart shopingCart;

    public Visitor(String name, String emailAdress) {
        this.shopingCart = new ShopingCart();
        this.name = name;
        this.emailAdress = emailAdress;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public ShopingCart getShopingCart() {
        return shopingCart;
    }

    public void setShopingCart(ShopingCart shopingCart) {
        this.shopingCart = shopingCart;
    }
}
