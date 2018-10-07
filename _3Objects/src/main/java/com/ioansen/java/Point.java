package com.ioansen.java;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**Calculates the distance between this point and another one
     * @param other the other Point
     * @return the distance as double*/
    public double distance(Point other)
    {
        int s = this.x-other.x;
        int d = this.y-other.y;
        return Math.sqrt(s * s + d * d);
    }

    /**Calculates the distance between this point and the given coordinates
     * @param x the x coordinate
     * @param y the y coordinate
     * @return the distance as double*/
    public double distance(int x, int y)
    {
        return distance(new Point(x,y));
    }

    @Override
    public String toString(){
        return "[" + x + "," + y + "]";
    }
}
