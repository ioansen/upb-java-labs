package com.ioansen.java.Shape;

public class Square extends Rectangle {

    public Square(){}

    public Square(double side){
        super(side,side);
    }

    public Square(String color, boolean isFilled, double side){
        super(color, isFilled, side,side);
    }

    public double getSide(){
        return getHeight();
    }

    public void setSide(double side){
        setHeight(side);
        setWidth(side);
    }

    @Override
    public String toString(){
        return "Square - color: " + getColor() + " isFilled: " + isFilled()
                + " side: " + getWidth();
    }
}
