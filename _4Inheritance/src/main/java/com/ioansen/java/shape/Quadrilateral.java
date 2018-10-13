package com.ioansen.java.shape;

public abstract class Quadrilateral implements Shape {

    protected int lat1, lat2, lat3, lat4;
    protected double ang1, ang2, ang3, ang4;

    public Quadrilateral(int lat1, int lat2, int lat3, int lat4) {
        this.lat1 = lat1;
        this.lat2 = lat2;
        this.lat3 = lat3;
        this.lat4 = lat4;
    }

    public Quadrilateral(int lat1, int lat2, int lat3, int lat4, double ang1, double ang2, double ang3, double ang4) {
        this(lat1, lat2, lat3, lat4);
        this.ang1 = ang1;
        this.ang2 = ang2;
        this.ang3 = ang3;
        this.ang4 = ang4;
    }

    public int getLat1() {
        return lat1;
    }

    public int getLat2() {
        return lat2;
    }

    public int getLat3() {
        return lat3;
    }

    public int getLat4() {
        return lat4;
    }

    public double getAng1() {
        return ang1;
    }

    public double getAng2() {
        return ang2;
    }

    public double getAng3() {
        return ang3;
    }

    public double getAng4() {
        return ang4;
    }

    public int perimeter(){
        return lat1 + lat2 + lat3 + lat4;
    }

    @Override
    public abstract double area();
}
