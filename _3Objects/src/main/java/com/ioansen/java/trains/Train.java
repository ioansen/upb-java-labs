package com.ioansen.java.trains;

import java.lang.*;

public class Train {


    private Route route;
    private Schedule schedule;
    private boolean local;

    public Train(Route r, Schedule s, boolean l) {
        route = r;
        schedule = s;
        local = l;
    }


    /**Calculates the price for this train
     * @return an integer representing the price*/
    public int price() {
        return local ? 2 * schedule.time() : schedule.time();
    }

    @Override
    public String toString()
    {
        return String.format("local: %b -- %s %s -> %s %s -- time: %s", local,
                route.origin, schedule.departure,
                route.destination, schedule.arrival, Clock.from(schedule.time()));
    }
}
