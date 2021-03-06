package com.ioansen.java.ShopEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {

    private final String name;
    private List<Product> products;

    public Shop(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    /**Returns an unmodifiable view of the products list
     * Attempting to modify the list will throw UnsupportedOperationException
     * @see UnsupportedOperationException
     * @return an unmodifiable view of the products list*/
    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public int getProductsCount(){
        return products.size();
    }

    /**Adds a new product to this shop
     * @param product the product to add
     * @return true if the product was added or false if the product was already present */
    public boolean addProduct(Product product){
        for (Product p : products){
            if (p.getName().equals(product.getName())){
                return false;
            }
        }
        return products.add(product);
    }

    /**Removes a product from this shop
     * @param product the product to remove
     * @return true if the product was removed or false if the product wasn't present*/
    public boolean removeProduct(Product product){
        return products.remove(product);
    }

    /**Removes a product from this shop based on the product's name
     * @param name the product's name
     * @return true if the product was removed or false if the product wasn't present*/
    public boolean removeProductByName(String name){
        for (Product p : products){
            if (p.getName().equals(name)){
                return products.remove(p);
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return name + products;
    }

    /**Calculates the total value of this shop
     * by adding the values of its products
     * @see Product#getValue()
     * @return the result*/
    public double getValue(){
        double value = 0;
        for(Product p : products){
            value += p.getValue();
        }
        return value;
    }
}
