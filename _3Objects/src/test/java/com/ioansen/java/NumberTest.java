package com.ioansen.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberTest {

    @Test
    public void addTest(){
        Number n = new Number(10);
        assertEquals(n.sum(9), 19);
        assertEquals(n.sum(9, 8), 27);
        assertEquals(n.sum(9, 8, 7), 34);
        assertEquals(n.sum(9, 8, 7, 6), 40);
    }
}
