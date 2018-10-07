package com.ioansen.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void distanceTest(){
        assertEquals(new Point().distance(new Point(0,2)), 2, 0.001);
        assertEquals(new Point().distance(new Point(3,0)), 3, 0.001);
        assertEquals(new Point().distance(new Point(2,2)), 2.8284, 0.001);
    }
}
