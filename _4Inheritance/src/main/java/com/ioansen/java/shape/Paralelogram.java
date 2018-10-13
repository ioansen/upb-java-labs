package com.ioansen.java.shape;

public class Paralelogram extends Quadrilateral {

    public Paralelogram(int lat1, int lat2, double ang) {
        super(lat1, lat2, lat1, lat2,
                ang, (360 - 2 * ang)/2, ang, (360 - 2 * ang)/2);
    }


    @Override
    public double area() {
        return lat1 * lat2 * Math.sin(Math.toRadians(ang1));
    }
}
