package com.ioansen.java.shape;

public class Rhomb extends Paralelogram{

    private double diag1, diag2;

    public Rhomb(int lat, double ang) {
        super(lat, lat, ang);
        diag1 = 2 * lat * Math.sin(Math.toRadians(ang/2));
        diag2 = 2 * lat * Math.sin(Math.toRadians(ang2/2));
    }

    public double getDiag1() {
        return diag1;
    }

    public double getDiag2() {
        return diag2;
    }

    @Override
    public double area() {
        return (diag1 * diag2)/2;
    }
}
