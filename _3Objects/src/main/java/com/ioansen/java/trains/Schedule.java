package com.ioansen.java.trains;

public class Schedule {

    private Clock departure;
    private Clock arrival;


    public Schedule(Clock dep, Clock arr)
    {
        departure = dep;
        arrival = arr;
    }

    /**Calculates the time between the departure and the arrival in minutes
     * @return an integer representing the minutes*/
    public int time()
    {
        int time = arrival.asMinutes() - departure.asMinutes();
        return time < 0 ? time + 24*60 : time;
    }
}
