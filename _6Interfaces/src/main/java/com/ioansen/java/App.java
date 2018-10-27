package com.ioansen.java;

import com.ioansen.java.Shape.*;


public class App 
{
    public static void main( String[] args )
    {
        Rectangle rectangle;

        //rectangle = new AbstractShape(); //cannot instantiate abstract class
        rectangle = new Square(6);

        Square square = new Square(7);

        Rectangle rectangle1 = (Rectangle) square;
        Shape shape = (Shape) square;
        Circle circle;
        /*if ( circle instanceof Square){
            circle = (Circle) square;
        }*/
        Circle c1 = new Circle();
        Square sq;
        //sq = (Square) c1; //same problem circle square
        //Conversie 2
        Rectangle r = new Rectangle(5.0, 5.0);
        if ( r instanceof Square){
            sq = (Square) r; //downcasting works if the type we're trying to cast is a square, in this case is not
            System.out.println("downcast form rectangle to square");
        }
        //Conversie 3
        sq = new Square(7.0);
        r = sq;
    }
}
