package com.ioansen.java.trains;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScheduleTest {

    @Test
    public void timeTest(){

        assertEquals(715, new Schedule(new Clock(10,20), new Clock(22,15)).time());
        assertEquals(515, new Schedule(new Clock(19,45), new Clock(4,20)).time() );
    }
}
