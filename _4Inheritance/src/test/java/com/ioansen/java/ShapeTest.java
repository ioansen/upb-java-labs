package com.ioansen.java;

import com.ioansen.java.shape.*;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

    @Test
    public void testShapeArea(){
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Paralelogram(10,10,90));
        shapes.add(new Rhomb(10,90));
        shapes.add(new Rectangle(10, 10));
        shapes.add(new Square(10));

        for (Shape s: shapes){
            assertEquals(100, s.area(), 0.001);
        }
    }
}
