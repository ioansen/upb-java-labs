package com.ioansen.java.Shape;

public class Rectangle extends AbstractShape {

    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean isFilled, double width, double height) {
        super(color, isFilled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return width + width + height + height;
    }

    @Override
    public String toString(){
        return "Rectangle - color: " + getColor() + " isFilled: " + isFilled()
                + " width: " + getWidth()
                + " height: " + getHeight();

    }
}
