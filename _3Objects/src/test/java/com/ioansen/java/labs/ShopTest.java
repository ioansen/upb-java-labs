package com.ioansen.java.labs;

import com.ioansen.java.labs.ShopEx.Product;
import com.ioansen.java.labs.ShopEx.Shop;
import com.ioansen.java.labs.util.Generator;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private static Product generateProduct(){
        ThreadLocalRandom r = ThreadLocalRandom.current();
        Product p =  new Product(Generator.randomString(r.nextInt(1,10)), r.nextDouble(0,50),r.nextInt(0,50));
        System.out.println("Generated product: " + p);
        return p;
    }

    private static Shop generateShop(String name){
        Shop s = new Shop(name);
        ThreadLocalRandom r = ThreadLocalRandom.current();
        int n = r.nextInt(1,10);
        for (int i = 0; i < 10 ; i++){
            s.addProduct(generateProduct());
        }
        System.out.println("Generated shop: " + s);
        return s;
    }

    @Test
    public void valueTest()
    {
        Shop shop = generateShop("supermarket");
        double value = 0.0;
        for (Product p : shop.getProducts()){
            assertEquals(p.getValue(), p.getPrice()*p.getStock(), 0.001);
            value += p.getValue();
        }
        assertEquals(shop.getValue(), value, 0.001);
    }

    @Test( expected = UnsupportedOperationException.class)
    public void modifyTest()
    {
        Shop shop = generateShop("supermarket 2");
        List<Product> products = shop.getProducts();
        System.out.println(products.get(0));
        products.set(0, generateProduct());
        System.out.println(products.get(0));
        System.out.println(shop);
    }
}
