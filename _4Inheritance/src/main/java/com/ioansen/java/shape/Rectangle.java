package com.ioansen.java.shape;

public class Rectangle extends Paralelogram {

    public Rectangle(int lat1, int lat2) {
        super(lat1, lat2, 90);
    }

    @Override
    public double area() {
        return lat1 * lat2;
    }
}
