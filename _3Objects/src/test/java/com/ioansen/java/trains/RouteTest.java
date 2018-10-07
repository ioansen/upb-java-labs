package com.ioansen.java.trains;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RouteTest {

    @Test
    public void timeTest(){

        assertTrue(new Route("Bucuresti", "Brasov").isTR(new Route("Brasov", "Bucuresti")));
        assertFalse(new Route("Bucuresti", "Brasov").isTR(new Route("Chrisna", "Bucuresti")));
    }
}
