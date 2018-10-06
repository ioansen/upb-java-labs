package com.ioansen.java.labs.ShopEx;

public class Product {

    private final String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return stock;
    }

    public void setAmount(int amount) {
        this.stock = amount;
    }

    @Override
    public String toString(){
        return String.format("Product: %s %.3f stock: %d", name,price,stock);
    }

    /**Calculates price * stock
     * @return the result(price * stock)*/
    public double getTotalProduct(){
        return price * stock;
    }
}
