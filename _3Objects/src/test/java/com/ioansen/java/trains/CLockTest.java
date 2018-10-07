package com.ioansen.java.trains;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CLockTest {

    @Test
    public void asMinutesTest(){
        assertEquals(new Clock(12,30).asMinutes(), 12*60 + 30);
        assertEquals(new Clock(19, 56).asMinutes(),19*60 + 56);
    }

    @Test
    public void fromTest(){
        assertEquals(Clock.from(999).asMinutes(), 999);
        assertEquals(Clock.from(9999).asMinutes(), 1359);
    }

    @Test
    public void asClockTest(){
        assertEquals(Clock.from("16:39").asMinutes(), 999);
        assertEquals(Clock.from("22:39").asMinutes(), 1359);
    }

    @Test(expected = IllegalArgumentException.class)
    public void asClockTestShouldThrowIllegal(){
        assertEquals(Clock.from("24:09").asMinutes(), 153);
    }
}
