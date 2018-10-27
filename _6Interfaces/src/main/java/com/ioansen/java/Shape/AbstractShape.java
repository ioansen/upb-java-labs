package com.ioansen.java.Shape;

public abstract class AbstractShape implements Shape {

    private String color;
    private boolean isFilled;

    public AbstractShape() {
        this("red", true);
    }

    public AbstractShape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean isFilled() {
        return isFilled;
    }

    @Override
    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public abstract double getArea();

    @Override
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape - color: " + getColor() + " isFilled: " + isFilled();
    }
}
